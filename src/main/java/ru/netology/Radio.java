package ru.netology;

public class Radio {
    String name;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    public int switchingRadioStation(){
        return currentRadioStation;
    }
    public int swithingMaxRadioStation(){
        return maxRadioStation;
    }
    public int swithingMinRadioStation(){
        return minRadioStation;
    }
    public int nextStation() {
        int next = switchingRadioStation() + 1;
        if (next < swithingMaxRadioStation()) ;
        else next = swithingMinRadioStation();
        return next;
    }
    public int revStation(){
        int rev = switchingRadioStation() - 1;
        if (rev > swithingMinRadioStation());
        else rev = swithingMaxRadioStation();
        return rev;
    }
    public int nextRadioStation(){
        return nextStation();
    }
    public int prevRadioStation(){
        return revStation();
    }
    public int setRadioStation(){
        int setStation = switchingRadioStation();
        return setStation;
    }

}


