package ru.tinkoff.behavior.command;

import ru.tinkoff.behavior.command.command.ChangePolicyCommand;
import ru.tinkoff.behavior.command.command.CommandInterface;
import ru.tinkoff.behavior.command.command.CreatePolicyCommand;
import ru.tinkoff.behavior.command.command.PayCommand;

import java.util.LinkedList;

public class PolicyCore {
    private LinkedList<CommandInterface> commandHistory = new LinkedList<>();

    public void createPolicy() {
        CommandInterface command = new CreatePolicyCommand();
        command.execute();
        commandHistory.push(command);
    }

    public void payPolicy() {
        CommandInterface command = new PayCommand();
        command.execute();
        commandHistory.push(command);
    }


    public void changePolicy() {
        CommandInterface command = new ChangePolicyCommand();
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        CommandInterface command = commandHistory.pop();
        command.cancel();
    }
}
