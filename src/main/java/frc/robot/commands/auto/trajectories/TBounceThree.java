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
 * A 90 degree turn in the shape of a quarter circle.
 * Start at the origin and travel left or right around a 5 foot radius circle.
 */
public class TBounceThree extends TBase {

  public TBounceThree() {

  }

  @Override
  public boolean isReversed() {
      return true; //TBounceTwo segment is driven reversed
  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
      x  |y  |angle
    S   0,  0,  0
    F -30,-30,
    G-120,-30, 90
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(-30), Units.inchesToMeters(-30)));
    end = new Pose2d(Units.inchesToMeters(-30), Units.inchesToMeters(-120), Rotation2d.fromDegrees(90)); //E
  }

}
