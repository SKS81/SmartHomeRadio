package my.idea.list;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVol;
    private int minVol = 0;
    private int maxVol = 10;

    public int getCurrentStation() {

        return currentStation;

    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < minStation || currentStation > maxStation) {

            return;

        }

        this.currentStation = currentStation;

    }

    public void nextStation() {

        if (maxStation <= currentStation) {

            setCurrentStation(minStation);

        } else {

            setCurrentStation(currentStation + 1);

        }

    }

    public void prevStation() {

        if (currentStation <= minStation) {

            setCurrentStation(maxStation);

        } else {

            setCurrentStation(currentStation - 1);

        }

    }

    public int getCurrentVol() {

        return currentVol;

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

        if (currentVol > 0) {

            currentVol--;

        }

    }

}