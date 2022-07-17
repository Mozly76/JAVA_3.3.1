package ru.netology.radioman.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Радиостанции

    @Test
    public void shouldSetWithinRadioStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxRadioStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinRadioStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radio = new Radio();

        radio.setToMaxNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio radio = new Radio();

        radio.setToMinNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNextNumberCurrentRadioStationWithin() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(5);
        radio.nextNumberCurrentRadioStation();

        int expected = 6;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNextNumberCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(9);
        radio.nextNumberCurrentRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doPrevNumberCurrentRadioStationWithin() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(5);
        radio.prevNumberCurrentRadioStation();

        int expected = 4;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doPrevNumberCurrentRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentRadioStation(0);
        radio.prevNumberCurrentRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Громкость

    @Test
    public void shouldSetSoundVolumeWithin() {
        Radio radio = new Radio();

        radio.setSoundVolume(8);

        int expected = 8;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() {
        Radio radio = new Radio();

        radio.setToMaxSoundVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinSoundVolume() {
        Radio radio = new Radio();

        radio.setToMinSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doIncreaseSoundVolumeWithin() {
        Radio radio = new Radio();

        radio.setSoundVolume(8);
        radio.increaseSoundVolume();

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doIncreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.increaseSoundVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doDecreaseSoundVolumeWithin() {
        Radio radio = new Radio();

        radio.setSoundVolume(5);
        radio.decreaseSoundVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doDecreaseSoundVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}