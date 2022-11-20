package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSelectStation() {
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectStationMoreThanMaxStation() {
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectStationLessThanMinStation() {
        radio.setCurrentStation(-3);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMaxStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMinStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVol() {
        radio.setCurrentVol(6);
        radio.increaseVol();
        int expected = 7;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolMoreMaxVol() {
        radio.setCurrentVol(101);
        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolLessThanMinVol() {
        radio.setCurrentVol(-3);
        radio.reduceVol();
        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVol() {
        radio.setCurrentVol(90);
        radio.increaseVol();
        int expected = 91;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVol(56);
        radio.reduceVol();
        int expected = 55;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolMaxVol() {
        radio.setCurrentVol(100);
        radio.increaseVol();
        int expected = 100;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolMintVol() {
        radio.setCurrentVol(0);
        radio.reduceVol();
        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }
}