package ru.tinkoff.behavior.mediator;

import ru.tinkoff.behavior.mediator.creator.PolicyCreator;

public class CreatePolicyMediator implements MediatorInterface {
    private PolicyCreator policyCreator;
    private PolicyPayment policyPayment;
    private TaskWorker taskWorker;

    public CreatePolicyMediator() {
        this.policyCreator = new PolicyCreator(this);
        this.policyPayment = new PolicyPayment(this);
        this.taskWorker = new TaskWorker(this);
    }

    @Override
    public void notify(ComponentInterface component) {
        if (component == policyCreator) {
            taskWorker.createActivity();
        } else if (component == taskWorker) {
            policyCreator.issuePolicy();
            policyPayment.createPaymentLink();
        }

    }

    public PolicyCreator getPolicyCreator() {
        return policyCreator;
    }

    public PolicyPayment getPolicyPayment() {
        return policyPayment;
    }

    public TaskWorker getTaskWorker() {
        return taskWorker;
    }
}
