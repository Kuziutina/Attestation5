package ru.tinkoff.behavior.memento.snapshot;

public class SnapshotPolicyImpl implements SnapshotPolicy{
    private String FIO;
    private boolean notification;

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getFIO() {
        return FIO;
    }

    public boolean isNotification() {
        return notification;
    }
}
