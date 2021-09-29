package ru.netology;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
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
    public void shouldMaxNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        int expected = 0;
        int actual = radio.nextStation();
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
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        int expected = 9;
        int actual = radio.revStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        int nomber = 5;
        int expected = nomber;
        int actual = radio.setRadioStation(nomber);
        assertEquals(expected, actual);
    }


    @Test
    public void shouldUpVolum() {
        Radio volume = new Radio();
        int actual = volume.setUpVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolum() {
        Radio volume = new Radio();
        int actual = volume.setDownVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUpMaxVolum() {
        Radio volume = new Radio();
        volume.setCurrentVolume(volume.getMaxVolume());
        int actual = volume.setUpVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMinVolum() {
        Radio volume = new Radio();
        volume.setCurrentVolume(volume.getMinVolume());
        int actual = volume.setDownVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
