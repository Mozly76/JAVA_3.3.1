package ru.netology.radioman.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // Радиостанции

    @Test
    public void shouldSetNumberRadioStations() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(0, radio.getMinNumberRadioStation());
        Assertions.assertEquals(29, radio.getMaxNumberRadioStation());
        Assertions.assertEquals(0, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetWithinRadioStation() {

        radio.setNumberCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxRadioStation() {

        radio.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinRadioStation() {

        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {

        radio.setToMaxNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {

        radio.setToMinNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNextNumberCurrentRadioStationWithin() {

        radio.setNumberCurrentRadioStation(8);
        radio.nextNumberCurrentRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNextNumberCurrentRadioStationAboveMax() {

        radio.setNumberCurrentRadioStation(9);
        radio.nextNumberCurrentRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doPrevNumberCurrentRadioStationWithin() {

        radio.setNumberCurrentRadioStation(1);
        radio.prevNumberCurrentRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doPrevNumberCurrentRadioStationBelowMin() {

        radio.setNumberCurrentRadioStation(0);
        radio.prevNumberCurrentRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Громкость

    @Test
    public void shouldSetSoundVolumeWithin() {

        radio.setSoundVolume(95);

        int expected = 95;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeAboveMax() {

        radio.setSoundVolume(111);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeBelowMin() {

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() {

        radio.setToMaxSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinSoundVolume() {

        radio.setToMinSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doIncreaseSoundVolumeWithin() {

        radio.setSoundVolume(99);
        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doIncreaseSoundVolumeAboveMax() {

        radio.setSoundVolume(100);
        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doDecreaseSoundVolumeWithin() {

        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doDecreaseSoundVolumeBelowMin() {

        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}