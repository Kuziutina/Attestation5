package ru.tinkoff.create.builder.builder;

import ru.tinkoff.create.builder.PolicyDocument;

public interface PolicyDocumentBuilderInterface {

    public PolicyDocumentBuilderInterface setLending();
    public PolicyDocumentBuilderInterface setTitle();
    public PolicyDocumentBuilderInterface setBody();
    public PolicyDocumentBuilderInterface setSign();
    public PolicyDocumentBuilderInterface setSeal();
    public PolicyDocumentBuilderInterface reset();
    public PolicyDocument build();
}
