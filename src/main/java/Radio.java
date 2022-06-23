public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int amountStation) {
        maxStation = amountStation - 1;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationUp() {

        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public int getStationUp() {
        return currentStation;
    }

    public void setStationDown() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getStationDown() {
        return currentStation;
    }


    public void setVolumeLouder() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public int getVolumeLouder() {
        return currentVolume;
    }

    public void seVolumeQuieter() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getVolumeQuieter() {

        return currentVolume;
    }
}