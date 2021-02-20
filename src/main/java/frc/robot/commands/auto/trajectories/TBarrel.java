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
public class TBarrel extends TBase {

  public TBarrel() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
        x|   y|angle
    S   0,   0,   0
    A   0, 120,
    B -30, 150,
    C -60, 120,
    D -30,  90,
    E   0, 120,
    F   0, 210,
    G  30, 240,
    H  60, 210,
    I  30, 180,
    J   0, 210,
    K  60, 270,
    L  30, 300,
    M   0, 270,
    N   0,   0, 180
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(30), Units.inchesToMeters(0)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(60), Units.inchesToMeters(30)));
    end = new Pose2d(Units.inchesToMeters(60), Units.inchesToMeters(60), Rotation2d.fromDegrees(90));
  }

}
