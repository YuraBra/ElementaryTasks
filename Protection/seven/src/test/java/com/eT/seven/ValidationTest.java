package com.eT.seven;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTest {

    Validation validation = new Validation();
    Input input = new Input();

    @Test
    public void validateSquareNumber() {
        input.setSquareNumber("-5");
        validation.validateSquareNumber();
        int actual = validation.getSquareNumberValid();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void validateSquareNumber01() {
        input.setSquareNumber("-5.5");
        validation.validateSquareNumber();
        int actual = validation.getSquareNumberValid();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void validateSquareNumber02() {
        input.setSquareNumber("someWords");
        validation.validateSquareNumber();
        int actual = validation.getSquareNumberValid();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void validateSquareNumber03() {
        input.setSquareNumber("55 88");
        validation.validateSquareNumber();
        int actual = validation.getSquareNumberValid();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void validateRowLength() {
        input.setRowLength("-10");
        validation.validateRowLength();
        int actual = validation.getRowLengthValid();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void validateRowLength01() {
        input.setRowLength("-10.10");
        validation.validateRowLength();
        int actual = validation.getRowLengthValid();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateRowLength02() {
        input.setRowLength("someWords");
        validation.validateRowLength();
        int actual = validation.getRowLengthValid();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void validateRowLength03() {
        input.setRowLength("22 55");
        validation.validateRowLength();
        int actual = validation.getRowLengthValid();
        int expected = 0;
        assertEquals(expected, actual);
    }
}