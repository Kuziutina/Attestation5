package ru.tinkoff.create.prototype.prototype;

public class PolicyDocument implements Prototype{
    private String lending;
    private String title;
    private String body;
    private String sign;
    private boolean seal;

    public String createDocument() {
        StringBuilder result = new StringBuilder();
        if (lending != null) {
            result.append(lending);
        }
        if (title != null) {
            result.append(title);
        }
        if (body != null) {
            result.append(body);
        }
        if (sign != null) {
            result.append(sign);
        }
        if (seal) {
            result.append("seal.img");
        }
        return result.toString();
    }

    public void setLending(String lending) {
        this.lending = lending;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setSeal(boolean seal) {
        this.seal = seal;
    }

    @Override
    public Prototype clone() {
        PolicyDocument policyDocument = new PolicyDocument();
        policyDocument.setTitle(this.title);
        policyDocument.setLending(this.lending);
        policyDocument.setBody(this.body);
        policyDocument.setSeal(this.seal);
        policyDocument.setSign(this.sign);
        return policyDocument;
    }
}

