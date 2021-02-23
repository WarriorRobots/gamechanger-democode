// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.auto.trajectories.TSlalom;
import frc.robot.subsystems.DrivetrainSubsystem;

/**
 * Auto made to run the Slalom Path
 * List of trajectories used
 * TSlalom: E1 E2 C4 C8 E10 D11 C10 E8 E4 C2 C1
 * 
 */
public class AutoSlalom extends SequentialCommandGroup {

    public AutoSlalom(
        DrivetrainSubsystem m_drive
    ) {
        super(
            new RamseteContainer(m_drive, new TSlalom()).getCommandAndStop()
        );
    }
}
