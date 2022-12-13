package my.idea.list;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVol;
    private int maxVol = 100;
    private int minVol = 0;

    public Radio() {
        maxStation = 9;
        minStation = 0;
    }

     public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
     }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVol() {
        return currentVol;
    }

    public void setCurrentVol(int currentVol) {
        if (currentVol < minVol) {
            return;
        }
        if (currentVol > maxVol) {
            return;
        }
        this.currentVol = currentVol;
    }

    public void increaseVol() {
        if (currentVol < 100) {
            currentVol++;
        }
    }

    public void reduceVol() {
        if (currentVol > 0) {
            currentVol--;
        }
    }
}