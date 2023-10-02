package ru.tinkoff.structure.composite.coefficient.component;

import ru.tinkoff.structure.composite.coefficient.Coefficient;

import java.math.BigDecimal;
import java.util.Random;

public class RandomCoefficient extends Coefficient {

    public RandomCoefficient(BigDecimal base) {
        super(base);
    }

    @Override
    public BigDecimal rate() {
        return base.multiply(coefficientRandom());
    }

    private BigDecimal coefficientRandom() {
        if (new Random().nextInt(10) < 5) {
            return new BigDecimal(0.5);
        }
        return new BigDecimal(1);
    }
}
