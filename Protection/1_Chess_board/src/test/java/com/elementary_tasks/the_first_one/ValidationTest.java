package com.elementary_tasks.the_first_one;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTest {
    EnterData enterData = new EnterData();
    Validation validation = new Validation();

    @Test
    public void validateHeight() {
        enterData.setHeight("5");
        validation.validateHeight();
        int actual = validation.getValidHeight();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void validateHeight1() {
        enterData.setHeight("-4");
        validation.validateHeight();
        int actual = validation.getValidHeight();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateHeight2() {
        enterData.setHeight("sss");
        validation.validateHeight();
        int actual = validation.getValidHeight();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateHeight3() {
        enterData.setHeight("55.55");
        validation.validateHeight();
        int actual = validation.getValidHeight();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateWidth() {
        enterData.setWidth("7");
        validation.validateWidth();
        int actual = validation.getValidWidth();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void validateWidth1() {
        enterData.setWidth("-6");
        validation.validateWidth();
        int actual = validation.getValidWidth();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateWidth2() {
        enterData.setWidth("rrr");
        validation.validateWidth();
        int actual = validation.getValidWidth();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateWidth3() {
        enterData.setWidth("88.89");
        validation.validateWidth();
        int actual = validation.getValidWidth();
        int expected = 0;
        assertEquals(expected, actual);
    }
}