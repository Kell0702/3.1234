package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    int nomber = 9;
    @Test
    public void shouldSwitchingRadioPlay(){
        Radio radio = new Radio();
        int actual = radio.switchingRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation(){
        Radio radio =new Radio() ;
        int actual = radio.nextRadioStation();
        int expected = 1;
        assertEquals (expected , actual );

    }
    @Test
    public void shouldMaxRadioStation(){
        Radio radio =new Radio();
        int actual = radio.nextStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation(){
        Radio radio = new Radio();
        int actual = radio.setRadioStation() ;
        int expected = 0;
        assertEquals (expected, actual);
    }
    @Test
    public void shouldMinRadioStation(){
        Radio radio =new Radio();
        int actual = radio.revStation();
        int expected = 9;
        assertEquals(expected,actual);
    }
    @Test
    public int shouldSetNumberRadioStation(){
        Radio radio = new Radio();
        int actual = radio.setRadioStation() + nomber ;
        int expected = 9;
        assertEquals (expected , actual);
        return actual;
    }
    @Test
    public void shouldNextEndRadioStation(){
        Radio radio =new Radio() ;
        int actual = radio.nextStation();
        radio.setRadioStation();
        int expected = 0;
        assertEquals (expected , actual );

    }


}