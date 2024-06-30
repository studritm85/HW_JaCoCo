package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxAtBeginning() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 1};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 20};
        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 5, 5, 5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-5, -15, -1, -9, -2};
        long expected = -1;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}
