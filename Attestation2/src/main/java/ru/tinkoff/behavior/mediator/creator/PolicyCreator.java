package ru.tinkoff.behavior.mediator.creator;

import ru.tinkoff.behavior.mediator.ComponentInterface;
import ru.tinkoff.behavior.mediator.MediatorInterface;

public class PolicyCreator implements ComponentInterface {
    private MediatorInterface mediator;

    public PolicyCreator(MediatorInterface mediator) {
        this.mediator = mediator;
    }

    public void createPolicy() {
        System.out.println("Создали полис");
        mediator.notify(this);
    }

    public void issuePolicy() {
        System.out.println("Выпустили полис");
    }


}
