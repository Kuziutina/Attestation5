package ru.tinkoff.behavior.iterator;

import ru.tinkoff.behavior.iterator.iterator.ClientIterator;
import ru.tinkoff.behavior.iterator.iterator.MortgageTIRIterator;
import ru.tinkoff.behavior.iterator.iterator.VIPVZRDataBaseIterator;

public class Main {
    public static void main(String[] args) {
        //Сначала ГВ сильные и независимые, сами храним все данные о клиентах.
        ClientIterator dataBaseIterator = new VIPVZRDataBaseIterator();
        while (dataBaseIterator.hasNext()) {
            System.out.println(dataBaseIterator.getNext().getName());
        }

        //Потом пришел тир и его клиентам тоже потребовался функционал. Но он не умеет возвращать как нам нужно, и чтобы не менять везде способ перебора - просто реализовываем новый итератор
        ClientIterator tirIterator = new MortgageTIRIterator();
        while (tirIterator.hasNext()) {
            System.out.println(tirIterator.getNext().getName());
        }
    }
}
