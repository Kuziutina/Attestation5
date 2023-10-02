package ru.tinkoff.behavior.memento;

import ru.tinkoff.behavior.memento.snapshot.SnapshotPolicy;
import ru.tinkoff.behavior.memento.snapshot.SnapshotPolicyImpl;

public class Policy {
    private String FIO;
    private boolean notification;

    public Policy(String FIO, boolean notification) {
        this.FIO = FIO;
        this.notification = notification;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public SnapshotPolicy save() {
        SnapshotPolicyImpl snapshotPolicy = new SnapshotPolicyImpl();
        snapshotPolicy.setFIO(FIO);
        snapshotPolicy.setNotification(notification);
        return snapshotPolicy;
    }

    public void restore(SnapshotPolicy snapshotPolicy) {
        FIO = snapshotPolicy.getFIO();
        notification = snapshotPolicy.isNotification();
    }

    @Override
    public String toString() {
        return "Policy{" +
                "FIO='" + FIO + '\'' +
                ", notification=" + notification +
                '}';
    }
}
