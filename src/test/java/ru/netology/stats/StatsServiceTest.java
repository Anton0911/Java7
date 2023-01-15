package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void TestSumSeles() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualSum = service.sum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void TestAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSales = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualAverageSales = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void TestMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void TestMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void TestMonthsLessAverageNumberSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNumberMonths = 5;
        long actualNumberMonths = service.monthsLessAverageNumberSales(sales);
        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);

    }

    @Test
    public void TestmonthsAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNumberMonths = 5;
        long actualNumberMonths = service.monthsLessAverageNumberSales(sales);
        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);
    }
}


//  @Test
// public void numberMonthMinimalSales() {
//  @Test
//    public void numberMonthMaxlSales() {
//     StatsService service = new StatsService();
//    long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//    long expectedDay = 5;
//    long actualDay = service.maxSales(sales);
//    Assertions.assertAll(expectedDay, actualDay);
// }

//}
