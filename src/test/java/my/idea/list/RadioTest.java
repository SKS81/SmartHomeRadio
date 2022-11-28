package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBeforeMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(6);

        int expected = 6;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(10);

        int expected = 10;
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
    public void shouldSelectVolMoreMaxVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(10);
        radio.increaseVol();

        int expected = 10;
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
    public void shouldIncreaseVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(7);
        radio.increaseVol();

        int expected = 8;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVol(5);
        radio.reduceVol();

        int expected = 4;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(50);

        int expected = 50;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(100);

        int expected = 100;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(0);

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolLessMinVolCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(0);
        radio.reduceVol();

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(78);
        radio.increaseVol();

        int expected = 79;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeCount() {
        Radio radio = new Radio(100);

        radio.setCurrentVol(66);
        radio.reduceVol();

        int expected = 65;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }
}