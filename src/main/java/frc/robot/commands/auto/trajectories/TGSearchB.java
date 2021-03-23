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
public class TGSearchB extends TBase {

  public TGSearchB() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
    subtracted 15 from y to get the front of the robot
        x|   y|angle
    S   0,   0,   0
    A  30,  45,
    B -30, 115,
    C -30, 135,
    D  30, 165,
    E  30, 195,
    F -30, 255, 
    N   0, 285,   0
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(45), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(105), Units.inchesToMeters(-30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(135), Units.inchesToMeters(-30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(165), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(195), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(255), Units.inchesToMeters(-30)));
    end = new Pose2d(Units.inchesToMeters(285), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
  }

}
