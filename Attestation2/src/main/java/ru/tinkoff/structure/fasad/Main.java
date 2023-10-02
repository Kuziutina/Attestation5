package ru.tinkoff.structure.fasad;

import ru.tinkoff.structure.fasad.creator.DocumentCreator;

public class Main {
    public static void main(String[] args) {
        DocumentCreator creator = new DocumentCreator();

        System.out.println(creator.createDocument());
        System.out.println(creator.createInstruction());
    }
}
