package ru.netology;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    public void shouldUpVolum(){
        Volume radio = new Volume();
        int actual = radio.setUpVolume();
        int expected = 4;
        assertEquals (expected , actual);
    }
    @Test
    public void shouldDownVolum(){
        Volume radio = new Volume();
        int actual = radio.setDownVolume();
        int expected = 2;
        assertEquals (expected , actual);
    }
    @Test
    public void shouldUpMaxVolum(){
        Volume radio = new Volume();
        radio.setCurrentVolume(radio.getMaxVolume());
        int actual = radio.setUpVolume();
        int expected = 10;
        assertEquals (expected , actual);
    }
    @Test
    public void shouldDownMinVolum(){
        Volume radio = new Volume();
        radio.setCurrentVolume(radio.getMinVolume());
        int actual = radio.setDownVolume();
        int expected = 0;
        assertEquals (expected , actual);
    }
}
