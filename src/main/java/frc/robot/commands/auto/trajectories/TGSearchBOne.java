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
public class TGSearchBOne extends TBase {

  public double endSpeed() {
    return 60;
  }

  public TGSearchBOne() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
    subtract 15 from y to get the front of the robot
        x|   y|angle| path
    S   0,   0,   0   1
    A  30,  60,       1
    B -30, 120,   0   1
    C -30, 150,       2
    D  30, 180,   0   2
    E  30, 210,       3
    F -30, 270,       3
    N   0, 300,   0   3
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(60), Units.inchesToMeters(30)));
    end = new Pose2d(Units.inchesToMeters(120), Units.inchesToMeters(-30), Rotation2d.fromDegrees(0));
  }

}
