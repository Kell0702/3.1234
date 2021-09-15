package ru.netology;

public class Radio {
    String name;
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
        this.currentRadioStation = currentRadioStation;
    }

    public int nextStation() {
        setCurrentRadioStation(getRadioStation() + 1);
        if (currentRadioStation < getMaxRadioStation()) ;
        else currentRadioStation = getMinRadioStation();
        return currentRadioStation;
    }

    public int revStation() {
        setCurrentRadioStation(getRadioStation() - 1);
        if (currentRadioStation > getMinRadioStation()) ;
        else currentRadioStation = getMaxRadioStation();
        return currentRadioStation;
    }

    public int setRadioStation0() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = currentRadioStation;
        return radio;
    }
    public int setRadioStation1() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation0() + 1;
        return radio;
    }
    public int setRadioStation2() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation1() + 1;
        return radio;
    }
    public int setRadioStation3() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation2() + 1;
        return radio;
    }
    public int setRadioStation4() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation3() + 1;
        return radio;
    }
    public int setRadioStation5() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation4() + 1;
        return radio;
    }
    public int setRadioStation6() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation5() + 1;
        return radio;
    }
    public int setRadioStation7() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation6() + 1;
        return radio;
    }
    public int setRadioStation8() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation7() + 1;
        return radio;
    }
    public int setRadioStation9() {
        setCurrentRadioStation(getMinRadioStation());
        int radio = setRadioStation8() + 1;
        return radio;
    }

}


