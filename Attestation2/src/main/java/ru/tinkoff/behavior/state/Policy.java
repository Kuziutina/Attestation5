package ru.tinkoff.behavior.state;

import ru.tinkoff.behavior.state.state.Draft;
import ru.tinkoff.behavior.state.state.State;

public class Policy {
    private State state;
    private Double premium;

    public Policy() {
        this.state = new Draft(this);
    }

    public void calculate() {
        state.calculate();
    }

    public void accept() {
        state.accept();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void generateDocument() {
        state.generatePolicyDocument();
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }
}
