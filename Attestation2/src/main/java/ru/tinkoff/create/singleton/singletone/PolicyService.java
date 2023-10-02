package ru.tinkoff.create.singleton.singletone;

public class PolicyService {
    private static PolicyService policyService = new PolicyService();

    private PolicyService() {
    }

    public static PolicyService getInstance() {
        return policyService;
    }
}
