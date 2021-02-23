// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.auto.RamseteContainer;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.commands.auto.trajectories.TBarrel;

/** 
 * Auto made to run the Bounce Path
 * List of trajectories used
 * TBarrel: C1 C5 D6 E5 D4 C5 C8 B9 A8 B7 C8 D9 E10 D11 C10 C1
 *
 * Time at 60 ips: ~21.5s
 * Time at 84 ips: ~17.5s (little difference at 108 ips)
 */
public class AutoBarrel extends SequentialCommandGroup {

    public AutoBarrel(
                    DrivetrainSubsystem m_drivetrain
    ) {
        super(
            new RamseteContainer(m_drivetrain, new TBarrel(){
                public double startSpeed() {return 0;}
                public double endSpeed() {return 0;}
            }).getCommandAndStop()
        );
    }
}
