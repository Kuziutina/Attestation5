package ru.tinkoff.fasad;

import ru.tinkoff.fasad.creator.DocumentCreator;

public class Main {
    public static void main(String[] args) {
        DocumentCreator creator = new DocumentCreator();

        System.out.println(creator.createDocument());
        System.out.println(creator.createInstruction());
    }
}
