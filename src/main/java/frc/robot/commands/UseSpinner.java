package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Spinner;

import java.util.HashSet;
import java.util.Set;

public class UseSpinner implements Command {
    Set<Subsystem> subsystems;

    public UseSpinner() {
        subsystems = new HashSet<Subsystem>();
        subsystems.add(RobotContainer.spinner);
    }

    @Override
    public void execute() {

    }

    @Override
    public Set<Subsystem> getRequirements() {
        return subsystems;
    }
}