package ru.tinkoff.composite.coefficient;

import java.math.BigDecimal;

public abstract class Coefficient implements CoefficientInterface{
    protected BigDecimal base;

    public Coefficient(BigDecimal base) {
        this.base = base;
    }

    public abstract BigDecimal rate();
}
