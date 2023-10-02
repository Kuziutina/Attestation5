package ru.tinkoff.create.builder.builder;

import ru.tinkoff.create.builder.PolicyDocument;

public class HCPolicyDocumentBuilder implements PolicyDocumentBuilderInterface {

    private PolicyDocument policyDocument;

    public HCPolicyDocumentBuilder() {
        policyDocument = new PolicyDocument();
    }

    @Override
    public PolicyDocumentBuilderInterface setLending() {
        policyDocument.setLending("HC Lending ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setTitle() {
        policyDocument.setTitle("HC title ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setBody() {
        policyDocument.setBody("HC body ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setSign() {
        policyDocument.setSign("HC gendir sign ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setSeal() {
        policyDocument.setSeal(true);
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface reset() {
        return new HCPolicyDocumentBuilder();
    }

    @Override
    public PolicyDocument build() {
        return policyDocument;
    }
}
