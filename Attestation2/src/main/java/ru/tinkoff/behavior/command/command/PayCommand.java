package ru.tinkoff.behavior.command.command;

public class PayCommand implements CommandInterface {
    @Override
    public void execute() {
        System.out.println("Оплачиваем полис");
    }

    @Override
    public void cancel() {
        System.out.println("Возвращаем деньги");
    }
}
