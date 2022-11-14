package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldChangeStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldSetStationMoreThanMaxStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldSetStationLessThanMinStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-3);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldNextStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldPrevStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldCycleBeforeMaxStation1() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldBeCycleBeforeMinStation1() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldChangeVol() {

        Radio radio = new Radio();

        radio.setCurrentVol(6);
        int expected = 6;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldSetVolMoreThanMaxVol() {

        Radio radio = new Radio();

        radio.setCurrentVol(15);
        radio.increaseVol();
        int expected = 1;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldSetVolLessThanMinVol() {

        Radio radio = new Radio();

        radio.setCurrentVol(-3);
        radio.reduceVol();
        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldIncreaseVol() {

        Radio radio = new Radio();
        radio.setCurrentVol(8);
        radio.increaseVol();
        int expected = 9;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldReduceVolume() {

        Radio radio = new Radio();

        radio.setCurrentVol(7);
        radio.reduceVol();
        int expected = 6;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldVolMaxLumitVol() {

        Radio radio = new Radio();

        radio.setCurrentVol(10);
        radio.increaseVol();
        int expected = 10;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

    @Test
    void shouldVolMinLimitVol() {

        Radio radio = new Radio();

        radio.setCurrentVol(0);
        radio.reduceVol();
        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected + " = " + actual);

    }

}