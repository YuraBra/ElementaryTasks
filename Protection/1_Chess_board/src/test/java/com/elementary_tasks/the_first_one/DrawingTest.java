package com.elementary_tasks.the_first_one;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrawingTest {
    EnterData enterData = new EnterData();
    Validation validation = new Validation();
    Drawing drawing = new Drawing();

    @Test
    public void draw() {
        enterData.setHeight("4");
        enterData.setWidth("10");
        validation.validateHeight();
        validation.validateWidth();
        drawing.draw();
        int actual = drawing.drawArray.size();
        int expected = 46;
        assertEquals(expected, actual);
    }

    @Test
    public void draw1() {
        enterData.setHeight("11");
        enterData.setWidth("2");
        validation.validateHeight();
        validation.validateWidth();
        drawing.draw();
        int actual = drawing.drawArray.size();
        int expected = 38;
        assertEquals(expected, actual);
    }

    @Test
    public void draw2() {
        enterData.setHeight("5");
        enterData.setWidth("5");
        validation.validateHeight();
        validation.validateWidth();
        drawing.draw();
        int actual = drawing.drawArray.size();
        int expected = 32;
        assertEquals(expected, actual);
    }
}