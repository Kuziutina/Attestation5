package ru.tinkoff.behavior.command.command;

public class CreatePolicyCommand implements CommandInterface {
    @Override
    public void execute() {
        System.out.println("Создаем полис");
    }

    @Override
    public void cancel() {
        System.out.println("Расторгаем полис");
    }
}
