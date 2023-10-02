package ru.tinkoff.behavior.memento;

import ru.tinkoff.behavior.memento.snapshot.SnapshotPolicy;

import java.util.LinkedList;
import java.util.List;

public class History {
    private final LinkedList<SnapshotPolicy> snapshotPolicies;

    public History() {
        this.snapshotPolicies = new LinkedList<>();
    }

    public void add(SnapshotPolicy snapshotPolicy) {
        snapshotPolicies.add(snapshotPolicy);
    }

    public SnapshotPolicy pop() {
        return snapshotPolicies.pop();
    }
}
