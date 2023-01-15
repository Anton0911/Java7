package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long averageSalesAmount(long[] sales) {
        long averageSales = 0;
        for (long sale : sales) {
            averageSales = averageSales + sale;
        }
        return averageSales / 12;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthsLessAverageNumberSales(long[] sales) {
        int numberMonths = 0;
        for (Long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

    public int monthsAboveAverageSales(long[] sales) {
        int numberMonths = 0;
        for (Long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                numberMonths++;
            }
        }
        return numberMonths;
    }
}
    


