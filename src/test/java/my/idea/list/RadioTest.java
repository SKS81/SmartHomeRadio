package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCurrentStation_Test_1() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStation_Test_2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation_Test_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation_Test_2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(14);
        radio.nextStation();
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMaxStation_Test_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMaxStation_Test_2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation_Test_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation_Test_2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(16);
        radio.prevStation();
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMinStation_Test_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMinStation_Test_2() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMoreMaxStation_Test_1() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(21);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMoreMaxStation_Test_2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMoreMinStation_Test_1() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMoreMinStation_Test_2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(50);
        int expected = 50;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(100);
        int expected = 100;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);
        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(55);
        radio.increaseVol();
        int expected = 56;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVol(72);
        radio.reduceVol();
        int expected = 71;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolLessMinVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);
        radio.reduceVol();
        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolMoreMaxVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(100);
        radio.increaseVol();
        int expected = 100;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxCurrentVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(101);
        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMinCurrentVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(-1);
        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }
}