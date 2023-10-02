package ru.tinkoff.behavior.chainresponsibility.policy.component;

public class Validator extends Component{

    @Override
    public void handle(String info) {
        if (info == null || info.isEmpty()) {
            throw new IllegalArgumentException();
        }
        handleNextIfNeeded(info);
    }
}
