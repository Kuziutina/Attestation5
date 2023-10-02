package ru.tinkoff.behavior.command.command;

public class ChangePolicyCommand implements CommandInterface {
    @Override
    public void execute() {
        System.out.println("Фиксируем изменения");
    }

    @Override
    public void cancel() {
        System.out.println("Откатываем изменения");
    }
}
