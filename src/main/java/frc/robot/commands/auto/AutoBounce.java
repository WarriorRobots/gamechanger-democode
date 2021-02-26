// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.commands.auto.trajectories.TBounceOne;
import frc.robot.commands.auto.trajectories.TBounceTwo;
import frc.robot.commands.auto.trajectories.TBounceThree;
import frc.robot.commands.auto.trajectories.TBounceFour;

/** 
 * Auto made to run the Bounce Path
 * List of trajectories used (* means that it is an objective)
 * TBounceOne:    C1  C2  B3  A3*
 * TBounceTwo:    A3  D4  E5  D6  A6*
 * TBounceThree:  A6  D6  E7  E8  D9  A9*
 * TBounceFour:   A9  B9  C10 C11
 */
public class AutoBounce extends SequentialCommandGroup {

    public AutoBounce(
                    DrivetrainSubsystem m_drivetrain
    ) {
        super(
            new RamseteContainer(m_drivetrain, new TBounceOne()).getCommand(),
            new RamseteContainer(m_drivetrain, new TBounceTwo()).getCommand(),
            new RamseteContainer(m_drivetrain, new TBounceThree()).getCommand(),
            new RamseteContainer(m_drivetrain, new TBounceFour()).getCommandAndStop()
        );
    }
}