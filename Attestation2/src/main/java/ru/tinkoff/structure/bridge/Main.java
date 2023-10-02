package ru.tinkoff.structure.bridge;

import ru.tinkoff.structure.bridge.policy.HCPolicy;
import ru.tinkoff.structure.bridge.policy.OSGPolicy;
import ru.tinkoff.structure.bridge.policy.Policy;
import ru.tinkoff.structure.bridge.sender.EmailSender;
import ru.tinkoff.structure.bridge.sender.MailSender;

public class Main {

    public static void main(String[] args) {
        Policy hcPolicyByEmail = new HCPolicy(new EmailSender());
        Policy hcPolicyByMail = new HCPolicy(new MailSender());
        Policy osgPolicyByMail = new OSGPolicy(new MailSender());

        hcPolicyByEmail.sendPolicy();
        hcPolicyByMail.sendPolicy();
        osgPolicyByMail.sendPolicy();
    }
}
