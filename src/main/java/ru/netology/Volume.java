package ru.netology;

public class Volume {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 3;

    public int setUpVolume() {
        int up = currentVolume + 1;
        if (up < maxVolume) ;
        else up = maxVolume;
        return up;
    }
    public int setDownVolume(){
        int down = currentVolume - 1;
        if (down > minVolume);
        else down = minVolume;
        return down;
    }
}
