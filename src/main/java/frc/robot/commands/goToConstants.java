package frc.robot.commands;

import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import frc.robot.util.TunableNumber;

public class goToConstants {

  public static final double thetakP = 0.007;
  public static final double thetakI = 0.0;
  public static final double thetakD = 0.0;
  public static final double thetaMaxVelocity = 5;
  public static final double thetaMaxAcceleration = 5;
  public static final double thetaTolerance = 1; // degree

  public static final boolean inFieldConstraint = false;
  public static final TunableNumber tunableThetaP =
      new TunableNumber("Commands/DriveTo/theta/P", thetakP);
  public static final TunableNumber tunableThetaI =
      new TunableNumber("Commands/DriveTo/theta/I", thetakI);
  public static final TunableNumber tunableThetaD =
      new TunableNumber("Commands/DriveTo/theta/D", thetakD);
  public static final TunableNumber tunableThetaMaxVelocity =
      new TunableNumber("Commands/DriveTo/theta/maxVelocity(degrees)", thetaMaxVelocity);
  public static final TunableNumber tunableThetaMaxAcceleration =
      new TunableNumber("Commands/DriveTo/theta/maxAcceleration(degrees)", thetaMaxAcceleration);
  public static final TunableNumber tunableThetaTolerance =
      new TunableNumber("Commands/DriveTo/theta/Tolerance(degrees)", thetaTolerance);

  public static ProfiledPIDController thetaController;

  public static void configurePID() {

    thetaController =
        new ProfiledPIDController(
            tunableThetaP.get(),
            tunableThetaI.get(),
            tunableThetaD.get(),
            new TrapezoidProfile.Constraints(
                Units.degreesToRadians(tunableThetaMaxVelocity.get()),
                Units.degreesToRadians(tunableThetaMaxAcceleration.get())),
            0.02);
    thetaController.setTolerance(Units.degreesToRadians(tunableThetaTolerance.get()));
    thetaController.enableContinuousInput(-Math.PI, Math.PI);
    thetaController.setGoal(0.0);
  }

  public static class PoseConstants {
    public static final Pose2d examplePose = new Pose2d(3.57, 2.75, Rotation2d.fromDegrees(60));
    public static final Pose2d examplePose2 = new Pose2d(1, 1, Rotation2d.fromDegrees(90));
    public static final double fieldLength = 17.548;
    public static final double fieldWidth = 8.042;

    public static final double shootCutoff = 4.282694;

    public static final double zone1 = 3;
    public static final double zone2 = 5.042;
    public static final Translation3d feedRight = new Translation3d(1.0, 1.5, 0.0);
    public static final Translation3d feedMiddle = new Translation3d(1.0, 4.021, 0.0);
    public static final Translation3d feedLeft = new Translation3d(1.0, 6.542, 0.0);
    public static final double overhangMiddle = 3.5;
    public static final double overhangSide = 1.5;

    public static enum AutonState {
      EXAMPLE1,
      EXAMPLE2,
      EXAMPLE3,
      DEFAULT
    }
  }
}
