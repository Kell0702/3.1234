package ru.netology;

public class Radio<getMaxRadioStation> {
    String name = "Radio";
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

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
            this.currentRadioStation = getMaxRadioStation();
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = getMinRadioStation();
            return;
        }
        this.currentRadioStation = currentRadioStation;
        return;
    }

    public int nextStation() {
        setCurrentRadioStation(getRadioStation() + 1);
        return currentRadioStation;
    }

    public int revStation() {
        setCurrentRadioStation(getRadioStation() - 1);
        return currentRadioStation;
    }

    public int setRadioStation(int nomberStation) {
        setCurrentRadioStation(nomberStation);
        return this.currentRadioStation;
    }

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 3;

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < getMinVolume()) {
            return;
        }
        if (currentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int setUpVolume() {
        setCurrentVolume(getCurrentVolume() + 1);
        if (currentVolume < getMaxVolume()) {
        } else {
            currentVolume = getMaxVolume();
        }
        return currentVolume;
    }

    public int setDownVolume() {
        setCurrentVolume(getCurrentVolume() - 1);
        if (currentVolume > getMinVolume()) {
        } else {
            currentVolume = getMinVolume();
        }
        return currentVolume;
    }

}


