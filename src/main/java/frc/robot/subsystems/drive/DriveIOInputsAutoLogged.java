package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class DriveIOInputsAutoLogged extends DriveIO.DriveIOInputs
    implements LoggableInputs, Cloneable {
  @Override
  public void toLog(LogTable table) {
    table.put("leftPositionRad",leftPositionRad);
    table.put("leftVelocityRadPerSec", leftVelocityRadPerSec);
    table.put("leftAppliedVolts", leftAppliedVolts);
    table.put("leftCurrentAmps", leftCurrentAmps);

    table.put("rightPositionRad",rightPositionRad);
    table.put("rightVelocityRadPerSec", rightVelocityRadPerSec);
    table.put("rightAppliedVolts", rightAppliedVolts);
    table.put("rightCurrentAmps", rightCurrentAmps);
  }

  @Override
  public void fromLog(LogTable table) {
    leftPositionRad = table.get("leftPositionRad",leftPositionRad);
    leftVelocityRadPerSec = table.get("leftVelocityRadPerSec", leftVelocityRadPerSec);
    leftAppliedVolts = table.get("leftAppliedVolts", leftAppliedVolts);
    leftCurrentAmps = table.get("leftCurrentAmps", leftCurrentAmps);

    rightPositionRad = table.get("rightPositionRad",rightPositionRad);
    rightVelocityRadPerSec = table.get("rightVelocityRadPerSec", rightVelocityRadPerSec);
    rightAppliedVolts= table.get("rightAppliedVolts", rightAppliedVolts);
    rightCurrentAmps = table.get("rightCurrentAmps", rightCurrentAmps);
  }

  public DriveIOInputsAutoLogged clone() {
    DriveIOInputsAutoLogged copy = new DriveIOInputsAutoLogged();
    copy.leftPositionRad = leftPositionRad;
    copy.leftAppliedVolts = leftAppliedVolts;
    copy.leftCurrentAmps= leftCurrentAmps;
    copy.leftVelocityRadPerSec = leftVelocityRadPerSec;
    copy.rightPositionRad = rightPositionRad;
    copy.rightAppliedVolts = rightAppliedVolts;
    copy.rightCurrentAmps= rightCurrentAmps;
    copy.rightVelocityRadPerSec = rightVelocityRadPerSec;
    return copy;
  }
}
