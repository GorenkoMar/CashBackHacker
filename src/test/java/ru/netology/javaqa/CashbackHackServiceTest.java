package ru.netology.javaqa;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmount1() {

        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldAmountZero() {

        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldMAmount999() {

        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldMAmount1000() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldAmount500() {

        Assert.assertEquals(service.remain(500), 500);
    }


}
