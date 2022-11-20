package my.idea.list;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVol;
    private int minVol = 0;
    private int maxVol = 100;

    public Radio(int currentStation, int minStation, int maxStation, int currentVol, int minVol, int maxVol) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVol = currentVol;
        this.minVol = minVol;
        this.maxVol = maxVol;
    }

    public Radio() {}

    public int getNumberOfStation() {
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMinStation(int minStation) {
        currentStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        currentStation = maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            setCurrentStation(currentStation ++);
        } else {
            setCurrentStation(minStation);
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            setCurrentStation(currentStation --);
        } else {
            setCurrentStation(maxStation);
        }
    }

    public int getCurrentVol() {
        return currentVol;
    }

    public int getMinVol() {
        return minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }

    public void setMinVol() {
        currentVol = minVol;
    }

    public void setMaxVol() {
        currentVol = maxVol;
    }

    public void setCurrentVol(int currentVol) {
        if (currentVol < minVol || currentVol > maxVol) {
            return;
        }
        this.currentVol = currentVol;
    }

    public void increaseVol() {
        if (currentVol < maxVol) {
            currentVol++;
        }
    }

    public void reduceVol() {
        if (currentVol > minVol) {
            currentVol--;
        }
    }
}