package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNextRadioStation(){
        Radio radio =new Radio() ;
        int actual = radio.nextRadioStation();
        int equals = 1;
        assertEquals (equals , actual );

    }
    @Test
    public void shouldDownRadioStation(){
        Radio radio = new Radio();
        int actual = radio.prevRadioStation();
        int equals = 9;
        assertEquals (equals, actual);
    }
    @Test
    public void shouldSetNumberRadioStation(){
        Radio radio = new Radio();
        int number = 4;
        cond.setStation() = cond.currentRadioStation() = 4;
        int actual = radio.setRadioStation();
        int equals = 4;
        assertEquals(equals , actual);
    }


}