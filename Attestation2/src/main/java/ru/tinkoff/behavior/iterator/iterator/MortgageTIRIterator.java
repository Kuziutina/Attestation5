package ru.tinkoff.behavior.iterator.iterator;

import ru.tinkoff.behavior.iterator.client.Client;

import java.util.ArrayList;
import java.util.List;

public class MortgageTIRIterator implements ClientIterator {
    //Печаль беда - тир не умеет возвращать нам сразу все про клиентов. Он может вернуть нам только айди, а за инфо нужно ходить отдельно
    private List<Integer> clients;
    private int current = 0;

    @Override
    public Client getNext() {
        if (clients == null) {
            getClients();
        }
        return getClientById(clients.get(current++));
    }

    @Override
    public boolean hasNext() {
        if (clients == null) {
            getClients();
        }
        return current < clients.size();
    }

    private void getClients() {
        System.out.println("Идем в тир за клиентами");
        clients = new ArrayList<>();
        clients.add(1);
        clients.add(2);
        clients.add(3);
    }

    private Client getClientById(int id) {
        System.out.println("Идем в тир за клиентом с id " + id);
        if (id == 1) return new Client("Masha");
        if (id == 2) return new Client("Igor");
        if (id == 3) return new Client("Sasha");
        return null;
    }
}
