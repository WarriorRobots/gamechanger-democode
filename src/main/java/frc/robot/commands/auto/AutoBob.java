// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import java.util.Random;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.Vars;
import frc.robot.commands.auto.bob.Bob;

/** He might do it */
public class AutoBob extends SequentialCommandGroup {

    public AutoBob(String something) {
        super(
            new Bob(something)
        );
    }
}