package ru.tinkoff.composite;

import ru.tinkoff.composite.coefficient.component.AgeCoefficient;
import ru.tinkoff.composite.coefficient.CompoundCoefficient;
import ru.tinkoff.composite.coefficient.component.GenderCoefficient;
import ru.tinkoff.composite.coefficient.component.RandomCoefficient;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal base = new BigDecimal(1000);
        CompoundCoefficient baseRating = new CompoundCoefficient();
        baseRating.add(new RandomCoefficient(base));
        CompoundCoefficient genderAndAge = new CompoundCoefficient();
        genderAndAge.add(new GenderCoefficient(base, true));
        genderAndAge.add(new AgeCoefficient(base, 32));
        baseRating.add(genderAndAge);

        System.out.println(baseRating.rate());
    }
}
