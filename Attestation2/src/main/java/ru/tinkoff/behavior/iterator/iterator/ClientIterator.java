package ru.tinkoff.behavior.iterator.iterator;

import ru.tinkoff.behavior.iterator.client.Client;

public interface ClientIterator {
    public Client getNext();
    public boolean hasNext();
}
