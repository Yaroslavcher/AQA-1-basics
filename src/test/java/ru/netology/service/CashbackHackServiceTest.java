package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldReturn999() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, service.remain(1000));
    }
}
