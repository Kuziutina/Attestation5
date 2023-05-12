package ru.tinkoff.flyweight;

import ru.tinkoff.flyweight.document.DocumentCreator;

public class Main {
    public static void main(String[] args) {
        //У нас высылается много информационных писем/документов (напримерс разными акциями),
        //но у всех у них одинаковые начало и окончание (лого, печати, информация о банке и контактная информация)
        //и создавать и хранить в памяти (до чистки GC) все эти 1000 изображение и текста нет необходимости
        //и излишне
        DocumentCreator documentCreator = new DocumentCreator();
        documentCreator.initialize();

        for (int i = 0; i < 1000; i++) {
            System.out.println(documentCreator.createInfoDocument());
        }
    }
}
