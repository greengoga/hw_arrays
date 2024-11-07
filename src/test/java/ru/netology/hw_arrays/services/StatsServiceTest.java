package ru.netology.hw_arrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void lowestSalesMonth() { //месяц мин. продаж

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void highestSalesMonth() { //месяц макс. продаж

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesSum() { //сумма

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void salesSumAvg() { //Ср.сумма

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvgSum = 15;
        int actualAvgSum = service.salesSumAvg(sales);

        Assertions.assertEquals(expectedAvgSum, actualAvgSum);
    }


    @Test
    public void belowAvgMonth() { //кол-во мес. ниже ср.

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 5;
        int actualAvgSum = service.belowAvgMon(sales);

        Assertions.assertEquals(expectedAvg, actualAvgSum);
    }

    @Test
    public void aboveAvgMonth() { //кол-во мес. выше  ср.

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 5;
        int actualAvgSum = service.aboveAvgMon(sales);

        Assertions.assertEquals(expectedAvg, actualAvgSum);
    }

}


