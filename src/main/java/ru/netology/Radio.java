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
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = getMinRadioStation();
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int nextStation() {
        setCurrentRadioStation(getRadioStation() + 1);
//        if (currentRadioStation < getMaxRadioStation()) {
//        } else {
//            currentRadioStation = getMinRadioStation();
//        }
        return currentRadioStation;
    }

    public int revStation() {
        setCurrentRadioStation(getRadioStation() - 1);
        if (currentRadioStation > getMinRadioStation()) {
        } else {
            currentRadioStation = getMaxRadioStation();
        }
        return currentRadioStation;
    }

    public int setRadioStation(int nomberStation) {
        setCurrentRadioStation(getRadioStation());
        currentRadioStation = nomberStation;
        return nomberStation;
    }

    public static class Volume {
        String name = "Volume";
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

}


