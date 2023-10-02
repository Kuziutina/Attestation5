package ru.tinkoff.behavior.command;

public class Main {

    public static void main(String[] args) {
        PolicyCore policyCore = new PolicyCore();

        policyCore.createPolicy();
        policyCore.payPolicy();
        policyCore.undo();
        policyCore.changePolicy();
        policyCore.payPolicy();
    }
}
