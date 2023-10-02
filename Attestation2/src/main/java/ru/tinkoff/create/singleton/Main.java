package ru.tinkoff.create.singleton;

import ru.tinkoff.create.singleton.singletone.PolicyService;

public class Main {
    public static void main(String[] args) {
        PolicyService policyService = PolicyService.getInstance();
        System.out.println(policyService);
        PolicyService policyService2 = PolicyService.getInstance();
        System.out.println(policyService2);
    }
}
