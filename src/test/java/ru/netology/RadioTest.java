package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSwitchingRadioPlay() {
        Radio radio = new Radio();
        int actual = radio.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        int actual = radio.nextStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public int shouldMaxNextRadioStation() {
        Radio radio = new Radio();
        int expected = radio.getMinRadioStation();
        int actual = radio.nextStation();
        int nomber = 1;
        radio.nextStation(radio.setCurrentRadioStation( int currentRadioStation)+nomber);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinRadioStation() {
        Radio radio = new Radio();
        int actual = radio.revStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStation() {
        Radio radio = new Radio();
        int actual = radio.setRadioStation1();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownRadioStation() {
        Radio radio = new Radio();
        int actual = radio.setRadioStation1();
        int expected = 0;
        assertEquals(expected, actual);
    }


}