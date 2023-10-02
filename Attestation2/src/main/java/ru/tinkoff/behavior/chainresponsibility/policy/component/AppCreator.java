package ru.tinkoff.behavior.chainresponsibility.policy.component;

public class AppCreator extends Component {
    @Override
    public void handle(String info) {
        System.out.println("Заявка создана");
        info = info + " оформлена";
        handleNextIfNeeded(info);
    }
}
