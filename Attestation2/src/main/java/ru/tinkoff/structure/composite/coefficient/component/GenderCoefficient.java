package ru.tinkoff.structure.composite.coefficient.component;

import ru.tinkoff.structure.composite.coefficient.Coefficient;

import java.math.BigDecimal;

public class GenderCoefficient extends Coefficient {
    private boolean isFemale;

    public GenderCoefficient(BigDecimal base, boolean isFemale) {
        super(base);
        this.isFemale = isFemale;
    }

    @Override
    public BigDecimal rate() {
        return base.multiply(coefficientByGender());
    }

    private BigDecimal coefficientByGender() {
        if (isFemale) {
            return new BigDecimal(1);
        }
        return new BigDecimal(0.9);
    }
}
