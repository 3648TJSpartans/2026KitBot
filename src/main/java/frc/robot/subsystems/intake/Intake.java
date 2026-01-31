package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.motorUtils.MotorIO;

public class Intake extends SubsystemBase {

    private MotorIO intakeMotor;
    private MotorIO feedMotor;
    private MotorIO groundIntakeMotor;

    public Intake(MotorIO feedMotor, MotorIO intakeMotor, MotorIO groundIntakeMotor) {
        this.feedMotor = feedMotor;
        this.intakeMotor = intakeMotor;
        this.groundIntakeMotor = groundIntakeMotor;
    }

    public void runIntake(double speed) {
        intakeMotor.setPower(speed);
    }

    public void runFeed(double speed) {
        feedMotor.setPower(speed);
    }

    public void runGroundIntake(double speed) {
        groundIntakeMotor.setPower(speed);
    }
}
