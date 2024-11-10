package ru.netology.hw_arrays.services;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long salesSum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public long salesSumAvg(long[] sales) {
        long avgSum = 0;

        for (int i = 0; i < sales.length; i++) {
            avgSum = avgSum + sales[i];

        }

        long aSum = avgSum / sales.length;

        return aSum;
    }

    public long belowAvgMon(long[] sales) {
        int b = 0;
        long avgSum = salesSumAvg(sales);

        for (long sale : sales) {
            if (sale < avgSum) {
                b++;
            }
        }
        return b;
    }

    public long aboveAvgMon(long[] sales) {
        long avgSum = salesSumAvg(sales);
        int b = 0;

        for (long sale : sales) {
            if (sale > avgSum) {
                b++;
            }
        }
        return b;
    }
}
