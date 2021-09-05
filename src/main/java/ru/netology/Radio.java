package ru.netology;

public class Radio {
    String name;
//    int [] nomber = {0,1,2,3,4,5,6,7,8,9};
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = 0;

    public int switchingRadioStation(){
        currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }
    public int nextStation() {
        int next = currentRadioStation + 1;
        if (next < 9) ;
        else next = 0;
        return next;
    }
    public int revStation(){
        int rev = currentRadioStation - 1;
        if (rev < 0);
        else rev = 9;
        return rev;
    }
    public int nextRadioStation(){
        return nextStation();
    }
    public int prevRadioStation(){
        return revStation();
    }
    public int setRadioStation(){
        int setStation = int nomber;
        return setStation;
    }

}


