package ru.tinkoff.composite.coefficient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompoundCoefficient implements CoefficientInterface {
    private List<CoefficientInterface> coefficients;

    public CompoundCoefficient() {
        this.coefficients = new ArrayList<>();
    }

    public void add(CoefficientInterface coefficient) {
        coefficients.add(coefficient);
    }

    public void remove(CoefficientInterface coefficient) {
        coefficients.remove(coefficient);
    }

    public BigDecimal rate() {
        BigDecimal result = BigDecimal.ZERO;
        for (CoefficientInterface coefficient: coefficients) {
            result = result.add(coefficient.rate());
        }
        return result;
    }
}
