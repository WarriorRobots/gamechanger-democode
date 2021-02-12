// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.commands.auto.trajectories.TBounceOne;
import frc.robot.commands.auto.trajectories.TBounceThree;
import frc.robot.commands.auto.trajectories.TBounceTwo;

/** Add your docs here. */
public class AutoTest extends SequentialCommandGroup {

    public AutoTest(
                    DrivetrainSubsystem m_drivetrain
    ) {
        super(
            // new RamseteContainer(m_drivetrain, new TBounceOne(){
            //     public double maxSpeed() {return 12;}
            //     public double maxAcceleration() {return 12;}
            //     public double startSpeed() {return 0;}
            //     public double endSpeed() {return 0;}
            //   }).getCommand(),
            //   new RamseteContainer(m_drivetrain, new TBounceTwo(){
            //     public double maxSpeed() {return 12;}
            //     public double maxAcceleration() {return 12;}
            //     public double startSpeed() {return 0;}
            //     public double endSpeed() {return 0;}
            //   }).getCommand(),
            //   new RamseteContainer(m_drivetrain, new TBounceThree(){
            //     public double maxSpeed() {return 12;}
            //     public double maxAcceleration() {return 12;}
            //     public double startSpeed() {return 0;}
            //     public double endSpeed() {return 0;}
            //   }).getCommandAndStop()
        );
    }
}