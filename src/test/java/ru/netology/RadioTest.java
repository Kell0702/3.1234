package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//@AllArgsConstructor
//@NoArgsConstructor
//@Data

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
    public void shouldMaxNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        int expected = radio.nextStation();
        int actual = 0;
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
    public void shouldMixNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        int expected = 8;
        int actual = radio.revStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        int nomber= 5;
        int expected = 5;
        int actual = radio.setRadioStation(nomber);
        assertEquals(expected,actual);
    }


    @Test
    public void shouldUpVolum() {
        Radio.Volume volume = new Radio.Volume();
        int actual = volume.setUpVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolum() {
        Radio.Volume volume = new Radio.Volume();
        int actual = volume.setDownVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUpMaxVolum() {
        Radio.Volume volume = new Radio.Volume();
        volume.setCurrentVolume(volume.getMaxVolume());
        int actual = volume.setUpVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMinVolum() {
        Radio.Volume volume = new Radio.Volume();
        volume.setCurrentVolume(volume.getMinVolume());
        int actual = volume.setDownVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}