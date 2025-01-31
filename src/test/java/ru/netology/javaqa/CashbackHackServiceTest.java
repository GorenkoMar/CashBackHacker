package ru.netology.javaqa;

import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmount1() {

        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldAmountZero() {

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldMAmount999() {

        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldAmount500() {

        assertEquals(service.remain(500), 500);
    }


}
