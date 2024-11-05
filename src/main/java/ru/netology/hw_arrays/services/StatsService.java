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

    public int salesSum(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }

        return sum;
    }

    public int salesSumAvg(long[] sales) {
        int avgSum = 0;

        for (int i = 0; i < sales.length; i++) {
            avgSum = (int) (avgSum + sales[i]);

        }

        int aSum = avgSum / sales.length;

        return aSum;
    }

    public int belowAvgMon(long[] sales) {
        int b = 0;
        int avgSum = 0;

        for (int i = 0; i < sales.length; i++) {
            avgSum = (int) (avgSum + sales[i]);
        }

        int a = avgSum / sales.length;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < a) {
                b += 1;
            }
        }
        return b;
    }

    public int aboveAvgMon(long[] sales) {
        int b = 0;
        int avgSum = 0;

        for (int i = 0; i < sales.length; i++) {
            avgSum = (int) (avgSum + sales[i]);
        }

        int a = avgSum / sales.length;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > a) {
                b += 1;
            }
        }
        return b;
    }
}
