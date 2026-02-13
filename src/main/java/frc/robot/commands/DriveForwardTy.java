package frc.robot.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.drive.Drive;
import java.util.function.Supplier;

public class DriveForwardTy extends Command {
  private final Drive m_drive;
  private Supplier<Double> m_ty;

  public DriveForwardTy(Drive drive, Supplier<Double> ty) {
    m_drive = drive;
    m_ty = ty;
    addRequirements(m_drive);
  }



  @Override
  public void end(boolean interrupted) {
    m_drive.stop();
  }
}
