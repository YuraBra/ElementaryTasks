package com.elementary_tasks.seventh;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolverTest {
    Validation validation = new Validation();
    Input input = new Input();
    Solver solver = new Solver();

    @Test
    public void calculate() {

        input.setSquareNumber("25");
        validation.validateSquareNumber();
        input.setRowLength("5");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate01() {

        input.setSquareNumber("0");
        validation.validateSquareNumber();
        input.setRowLength("0");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate02() {

        input.setSquareNumber("asd");
        validation.validateSquareNumber();
        input.setRowLength("asasd");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate03() {

        input.setSquareNumber("-4");
        validation.validateSquareNumber();
        input.setRowLength("-4");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate04() {

        input.setSquareNumber("3.4");
        validation.validateSquareNumber();
        input.setRowLength("4.5");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate05() {

        input.setSquareNumber("125");
        validation.validateSquareNumber();
        input.setRowLength("150");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    public void calculate06() {

        input.setSquareNumber("12 5");
        validation.validateSquareNumber();
        input.setRowLength("15");
        validation.validateRowLength();
        solver.calculate();
        int actual = solver.getMyArray().size();
        int expected = 15;
        assertEquals(expected, actual);
    }

}