package ru.tinkoff.create.builder;

import ru.tinkoff.create.builder.builder.HCPolicyDocumentBuilder;
import ru.tinkoff.create.builder.builder.IFLPolicyDocumentBuilder;

public class Main {
    public static void main(String[] args) {
        PolicyDocumentGenerator generator = new PolicyDocumentGenerator(new HCPolicyDocumentBuilder());
        System.out.println(generator.createPolicyDocument().createDocument());
        System.out.println(generator.createSimplePolicyDocument().createDocument());

        generator.setBuilder(new IFLPolicyDocumentBuilder());
        System.out.println(generator.createPolicyDocument().createDocument());
        System.out.println(generator.createSimplePolicyDocument().createDocument());
    }
}
