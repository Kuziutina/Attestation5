package ru.tinkoff.bridge;

import ru.tinkoff.bridge.policy.HCPolicy;
import ru.tinkoff.bridge.policy.OSGPolicy;
import ru.tinkoff.bridge.policy.Policy;
import ru.tinkoff.bridge.sender.EmailSender;
import ru.tinkoff.bridge.sender.MailSender;

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
