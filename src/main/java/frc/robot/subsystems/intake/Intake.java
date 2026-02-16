package frc.robot.subsystems.intake;

import frc.robot.Constants.Status;
import frc.robot.util.motorUtil.MotorConfig;
import frc.robot.util.motorUtil.RelEncoderSparkMax;
import frc.robot.util.motorUtil.SingleSolenoidIO;

public class Intake extends RelEncoderSparkMax {
  public Intake() {
    super(new MotorConfig("Subsystems/Intake/Motor")
          .motorCan(6)
          .p(0)
          .i(0)
          .d(0)
          .maxPower(.1)
          .minPower(-.1)
          .positionTolerance(0.0));
  }

}
