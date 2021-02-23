/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto.trajectories;

import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.util.Units;

/**
 *
 */
public class TBounceFive extends TBase {

  public TBounceFive() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
      x  |y  |angle
    S    0,   0,   0
    H    0,  90
    I   30, 120
    J   60, 120
    K   90,  90
    L   90,   0, 180
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0)); //Starts at I
    Waypoints.add(new Translation2d(Units.inchesToMeters(30), Units.inchesToMeters(0)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(60), Units.inchesToMeters(30)));
    end = new Pose2d(Units.inchesToMeters(60), Units.inchesToMeters(120), Rotation2d.fromDegrees(90));
  }

}