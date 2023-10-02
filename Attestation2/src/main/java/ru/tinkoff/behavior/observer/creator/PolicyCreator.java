package ru.tinkoff.behavior.observer.creator;

import ru.tinkoff.behavior.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PolicyCreator {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void createPolicy(String policy) {
        System.out.println("create policy " + policy);
        notifySubscribers(policy);
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(String policy) {
        subscribers.forEach(subscriber -> subscriber.doLogic(policy));
    }
}
