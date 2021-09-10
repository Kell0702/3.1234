package ru.netology;

public class Volume {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 3;

    public int getMaxVolume(){
        return maxVolume;
    }
    public int getMinVolume(){
        return minVolume;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
//        if (getCurrentVolume() < getMinVolume()) {
//            return;
//        }
//        if (getCurrentVolume() > getMaxVolume()) {
//            return;
//        }
        this.currentVolume = currentVolume;
    }
    public int setUpVolume() {
        setCurrentVolume(getCurrentVolume()+1);
        if (currentVolume < getMaxVolume()) ;
        else currentVolume = getMaxVolume();
        return currentVolume;
    }
    public int setDownVolume(){
        setCurrentVolume(getCurrentVolume()-1);
        if (currentVolume > getMinVolume());
        else currentVolume = getMinVolume();
        return currentVolume;
    }
}
