package my.idea.list;

    public class Radio {

        private int currentStation;
        private int currentVol;
        private int maxStation;
        private int minStation;
        private int maxVol;
        private int minVol;

        public Radio() {
            maxStation = 9;
            minStation = 0;
            maxVol = 10;
            minVol = 0;
        }

        public Radio(int volCount) {
            maxVol = volCount + 1;

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
                currentVol = minVol;;
            }
            if (currentVol > maxVol) {
                currentVol = maxVol;
            }
            this.currentVol = currentVol;
        }

        public void increaseVol() {
            if (currentVol < maxVol) {
                currentVol++;
            } else {
                currentVol = maxVol;
            }
        }

        public void reduceVol() {
            if (currentVol > minVol) {
                currentVol--;
            } else {
                currentVol = minVol;
            }
        }
    }
