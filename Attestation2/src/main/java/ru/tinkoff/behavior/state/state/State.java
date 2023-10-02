package ru.tinkoff.behavior.state.state;

public interface State {
    public void accept();
    public void calculate();
    public void generatePolicyDocument();
}
