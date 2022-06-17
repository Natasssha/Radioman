public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amountStation = 9;


    //
    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.currentStation = amountStation;
        this.currentVolume = currentVolume;
    }
    public Radio() {

    }

    //
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > amountStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationUp() {

        if (currentStation < amountStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public int getStationUp() {
        return currentStation;
    }

    public void setStationDown() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = amountStation;
        }
    }

    public int getStationDown() {
        return currentStation;
    }


    public void setVolumeLouder() {
        if (currentVolume < 100) currentVolume++;

    }

    public int getVolumeLouder() {
        return currentVolume;
    }

    public void seVolumeQuieter() {
        if (currentVolume > 0) currentVolume--;
    }

    public int getVolumeQuieter() {

        return currentVolume;
    }

}
