package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;

/**MISSING CONSTANTS*/
public class Intake extends SubsystemBase {
    private TalonSRX intake, transfer;

    public Intake() {
        intake = new TalonSRX(RobotMap.Manipulator.Intake.INTAKE_PORT);
        transfer = new TalonSRX(RobotMap.Manipulator.Intake.INTAKE2_PORT);

        intake.setNeutralMode(NeutralMode.Brake);
        transfer.setNeutralMode(NeutralMode.Brake);
    }

    public TalonSRX getIntakeMotor() {
        return intake;
    }

    public TalonSRX getTransferMotor() {return transfer;}

    public boolean spiked(){
        return transfer.getSupplyCurrent() > Constants.Shooter.MAX_RPM;
    }
//unjam balls, get transfer motor current values, take the highest average, and if motor spikes, revert motors
}