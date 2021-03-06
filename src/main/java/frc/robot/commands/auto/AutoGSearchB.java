// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.FeedSubsystem;
import frc.robot.subsystems.HopperSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Vars;
import frc.robot.commands.arm.ArmToPosition;
import frc.robot.commands.arm.ArmZero;
import frc.robot.commands.auto.trajectories.TGSearchB;
import frc.robot.commands.auto.trajectories.TGSearchBOne;
import frc.robot.commands.auto.trajectories.TGSearchBThree;
import frc.robot.commands.auto.trajectories.TGSearchBTwo;
import frc.robot.commands.intake.IntakePower;

/** 
 * Auto made to run the Galactic Search Path B
 * List of trajectories used (* means that it has red ball ` means it has a blue ball)
 * TGSearch B: C1 B3* D5* D6` B7* B8` D10`
 * Runs the intake the entire time while following the path
 */
public class AutoGSearchB extends SequentialCommandGroup {

    public AutoGSearchB(
                        DrivetrainSubsystem m_drivetrain,
                        FeedSubsystem feed,
                        HopperSubsystem hopper,
                        ArmSubsystem arm,
                        IntakeSubsystem intake
                        ) 
    {
        super(
            //preps the arm for intake
            new ArmZero(arm),
            new ArmToPosition(arm, Vars.ARM_OUT-5),

            //runs the path and intakes the balls
            new ParallelDeadlineGroup(
                new SequentialCommandGroup(
                    new RamseteContainer(m_drivetrain, new TGSearchBOne()).getCommand(),
                    new RamseteContainer(m_drivetrain, new TGSearchBTwo()).getCommand(),
                    new RamseteContainer(m_drivetrain, new TGSearchBThree()).getCommandAndStop()
                ),
                new IntakePower(intake, Vars.INTAKE_PERCENT-.1)
            ),

            //
            new ArmToPosition(arm, 2)
        );
    }
}
