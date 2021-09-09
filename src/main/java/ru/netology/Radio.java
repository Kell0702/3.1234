package ru.netology;

public class Radio {
    String name;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    public int currentRadioStation = minRadioStation;

    public int getRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {

            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int nextStation() {
        int newCurrentRadioStation = (setCurrentRadioStation(int currentRadioStation) + 1);
        if (newCurrentRadioStation < getMaxRadioStation()) ;
        else newCurrentRadioStation = getMinRadioStation();
        return newCurrentRadioStation;
    }

    public int revStation() {
        int newCurrentRadioStation = currentRadioStation - 1;
        if (newCurrentRadioStation > getMaxRadioStation()) ;
        else newCurrentRadioStation = maxRadioStation;
        return currentRadioStation = newCurrentRadioStation;
    }

    public int nextRadioStation() {
        return nextStation();
    }

    public int prevRadioStation() {
        return revStation();
    }

    public int setRadioStation1() {
        int radio1 = 0;
        return radio1;
    }

}


