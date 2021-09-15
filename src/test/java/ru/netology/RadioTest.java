package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Data
@NoArgsConstructor
@AllArgsConstructor

class RadioTest {
    int number = 10;
    int up = 1;
    int down = -1;

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

//    @Test
//    public void shouldSetNumberRadioStation() {
//        Radio radio = new Radio();
//        int actual = radio.setRadioStation0();
//        int expected = 0;
//        assertEquals(expected, actual);
//    }

    @Test
    public void shouldDownRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation0());
        int actual = radio.setRadioStation0();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation1());
        int actual = radio.setRadioStation1();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation2());
        int actual = radio.setRadioStation2();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation3());
        int actual = radio.setRadioStation3();
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation4());
        int actual = radio.setRadioStation4();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation5());
        int actual = radio.setRadioStation5();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation6());
        int actual = radio.setRadioStation6();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation7());
        int actual = radio.setRadioStation7();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation8());
        int actual = radio.setRadioStation8();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDownRadioStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.setRadioStation9());
        int actual = radio.setRadioStation9();
        int expected = 9;
        assertEquals(expected, actual);
    }


}