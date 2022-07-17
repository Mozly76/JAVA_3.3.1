package ru.netology.radioman.service;

public class Radio {
    public int numberCurrentRadioStation;
    public int soundVolume;

    // Радиостанции
    public void setToMaxNumberRadioStation() {
        numberCurrentRadioStation = 9;
    }

    public void setToMinNumberRadioStation() {
        numberCurrentRadioStation = 0;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            return;
        }
        if (newNumberCurrentRadioStation > 9) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void nextNumberCurrentRadioStation() {
        if (numberCurrentRadioStation < 9) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
        if (numberCurrentRadioStation >= 9) {
            numberCurrentRadioStation = 0;
        }
    }

    public void prevNumberCurrentRadioStation() {
        if (numberCurrentRadioStation > 0) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
        if (numberCurrentRadioStation <= 0) {
            numberCurrentRadioStation = 9;
        }
    }

    // Громкость
    public void setToMaxSoundVolume() {
        soundVolume = 10;
    }

    public void setToMinSoundVolume() {
        soundVolume = 0;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        if (newSoundVolume > 10) {
            newSoundVolume = 10;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
        if (soundVolume >= 10) {
            soundVolume = 10;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume <= 0) {
            soundVolume = 0;
        }
    }
}