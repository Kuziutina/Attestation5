package ru.tinkoff.behavior.state;

public class Main {
    public static void main(String[] args) {
        Policy policy = new Policy();
        policy.calculate();
        policy.generateDocument();
        policy.accept();
        policy.generateDocument();
        policy.accept();
        policy.generateDocument();
    }
}
