package ru.tinkoff.flyweight.document;

public class DocumentCreator {
    private String title;
    private String end;

    public void initialize() {
        this.title = createTitle();
        this.end = createEndOfDocument();
    }

    public String createInfoDocument() {
        StringBuilder document = new StringBuilder();
        document.append(title);
        document.append("Information");
        document.append(end);

        return document.toString();
    }

    public String createPolicy() {
        StringBuilder document = new StringBuilder();
        document.append(title);
        document.append("Policy");
        document.append(end);

        return document.toString();
    }

    private String createTitle() {
        //Здесь происходят некие "тяжелые" операции (запрос и хранение картинки, запрос и хранение банковской информации)
        return "Title";
    }

    private String createEndOfDocument() {
        //Здесь происходят некие "тяжелые" операции (запрос и хранение картинки, запрос и хранение банковской информации)
        return "End";
    }
}
