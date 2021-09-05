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
}
