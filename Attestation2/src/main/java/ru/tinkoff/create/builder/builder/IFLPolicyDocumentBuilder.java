package ru.tinkoff.create.builder.builder;

import ru.tinkoff.create.builder.PolicyDocument;

public class IFLPolicyDocumentBuilder implements PolicyDocumentBuilderInterface {

    private PolicyDocument policyDocument;

    public IFLPolicyDocumentBuilder() {
        policyDocument = new PolicyDocument();
    }

    @Override
    public PolicyDocumentBuilderInterface setLending() {
        policyDocument.setLending("IFL Lending ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setTitle() {
        policyDocument.setTitle("IFL title ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setBody() {
        policyDocument.setBody("IFL body ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setSign() {
        policyDocument.setSign("IFL gendir sign ");
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface setSeal() {
        policyDocument.setSeal(true);
        return this;
    }

    @Override
    public PolicyDocumentBuilderInterface reset() {
        return new IFLPolicyDocumentBuilder();
    }

    @Override
    public PolicyDocument build() {
        return policyDocument;
    }
}
