package ru.tinkoff.behavior.memento;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        Policy policy = new Policy("Kuzyutina Sonya", true);
        history.add(policy.save());
        policy.setNotification(false);
        System.out.println(policy);
        policy.restore(history.pop());
        System.out.println(policy);
    }
}
