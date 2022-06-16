public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    //
    public Radio(int currentStation, int currentVolume, int minStation, int maxStation, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }


    //
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationUp() {

        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public int getStationUp() {
        return currentStation;
    }

    public void setStationDown() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getStationDown() {
        return currentStation;
    }


    public void setVolumeLouder() {
        if (currentVolume < maxVolume) currentVolume++;

    }

    public int getVolumeLouder() {
        return currentVolume;
    }

    public void seVolumeQuieter() {
        if (currentVolume > minVolume) currentVolume--;
    }

    public int getVolumeQuieter() {

        return currentVolume;
    }

}
        return currentVolume;
    }
}
