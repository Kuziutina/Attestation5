package ru.tinkoff.behavior.iterator.iterator;

import ru.tinkoff.behavior.iterator.client.Client;

import java.util.ArrayList;
import java.util.List;

public class VIPVZRDataBaseIterator implements ClientIterator {

    private List<Client> clients;
    private int current = 0;

    @Override
    public Client getNext() {
        if (clients == null) {
            getClients();
        }
        return clients.get(current++);
    }

    @Override
    public boolean hasNext() {
        if (clients == null) {
            getClients();
        }
        return current < clients.size();
    }

    private void getClients() {
        System.out.println("Получаем клиентов из БД");
        clients = new ArrayList<>();
        clients.add(new Client("Masha"));
        clients.add(new Client("Igor"));
        clients.add(new Client("Sasha"));
    }
}
