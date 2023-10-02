package ru.tinkoff.structure.composite.coefficient.component;

import ru.tinkoff.structure.composite.coefficient.Coefficient;

import java.math.BigDecimal;

public class AgeCoefficient extends Coefficient {
    private Integer age;

    public AgeCoefficient(BigDecimal base, Integer age) {
        super(base);
        this.age = age;
    }

    @Override
    public BigDecimal rate() {
        return base.multiply(coefficientByAge());
    }

    private BigDecimal coefficientByAge() {
        if (age < 18) {
            return new BigDecimal(0.5);
        }
        return new BigDecimal(0.7);
    }
}
