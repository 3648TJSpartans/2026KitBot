package frc.robot.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.drive.Drive;
import java.util.function.Supplier;
import org.littletonrobotics.junction.Logger;

public class RotateTo extends Command {
  private final Drive drive;
  private Supplier<Double> targetRotation;

  /**
   * Constructor for RotateTo command.
   *
   * @param drive: A drive subsystem instance.
   * @param targetRotation: The target rotation angle in radians.
   */
  public RotateTo(Drive drive, Supplier<Double> targetRotation) {
    this.drive = drive;
    this.targetRotation = targetRotation;
    addRequirements(drive);
  }

  @Override
  public void end(boolean interrupted) {
    drive.stop();
  }
}
