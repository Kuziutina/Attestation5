package ru.tinkoff.create.builder;

import ru.tinkoff.create.builder.builder.PolicyDocumentBuilderInterface;

public class PolicyDocumentGenerator {
    private PolicyDocumentBuilderInterface builder;

    public PolicyDocumentGenerator(PolicyDocumentBuilderInterface policyDocumentBuilder) {
        this.builder = policyDocumentBuilder;
    }

    public PolicyDocument createPolicyDocument() {
        return builder.reset().setLending().setTitle().setBody().setSeal().setSign().build();
    }

    public PolicyDocument createSimplePolicyDocument() {
        return builder.reset().setTitle().setBody().build();
    }

    public void setBuilder(PolicyDocumentBuilderInterface builder) {
        this.builder = builder;
    }
}
