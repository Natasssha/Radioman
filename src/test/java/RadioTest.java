import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio cond = new Radio();

    @Test
    void shouldMaxCurrentStation() {
        cond.setCurrentStation(100);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, cond.getCurrentStation());
    }

    @Test
    void shouldMinCurrentStation() {
        cond.setCurrentStation(-100);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, cond.getCurrentStation());
    }

    @Test
    void shouldCurrentStationUp() {
        cond.setCurrentStation(9);
        int actual = cond.getCurrentStation();

        int expected = 9;

        assertEquals(expected, cond.getCurrentStation());
    }

    @Test
    void shouldMaxCurrentVolume() {
        cond.setCurrentVolume(100);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    void shouldMinCurrentVolume() {
        cond.setCurrentVolume(-100);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, cond.getCurrentVolume());
    }


    @Test
    void shouldCurrentVolumeQuieter() {
        cond.setCurrentVolume(0);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    void shouldCurrentVolumeLouder() {
        cond.setCurrentVolume(10);
        int actual = cond.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    void shouldStationUp() {
        cond.setStationUp(); // 0
        cond.setStationUp(); // 1
        cond.setStationUp(); // 2
        cond.setStationUp(); // 3
        cond.setStationUp(); // 4
        cond.setStationUp(); // 5
        cond.setStationUp(); // 6
        cond.setStationUp(); // 7
        cond.setStationUp(); // 8
        cond.setStationUp(); // 9
        assertEquals(0, cond.getStationUp());
    }

    @Test
    void shouldStationDown() {
        cond.setStationDown(); // 0
        cond.setStationDown(); // 9
        cond.setStationDown(); // 8
        cond.setStationDown(); // 7
        cond.setStationDown(); // 6
        cond.setStationDown(); // 5
        cond.setStationDown(); // 4
        cond.setStationDown(); // 3
        cond.setStationDown(); // 2
        cond.setStationDown(); // 1
        assertEquals(0, cond.getStationDown());
    }

    @Test
    void shouldVolumeLouder() {
        cond.setVolumeLouder(); // 0
        cond.setVolumeLouder(); // 1
        cond.setVolumeLouder(); // 2
        cond.setVolumeLouder(); // 3
        cond.setVolumeLouder(); // 4
        cond.setVolumeLouder(); // 5
        cond.setVolumeLouder(); // 6
        cond.setVolumeLouder(); // 7
        cond.setVolumeLouder(); // 8
        cond.setVolumeLouder(); // 9
        cond.setVolumeLouder(); // 10
        assertEquals(0, cond.getVolumeLouder());
    }

    @Test
    void shouldVolumeQuieter() {
        cond.seVolumeQuieter(); // 0
        cond.seVolumeQuieter(); // 10
        cond.seVolumeQuieter(); // 9
        cond.seVolumeQuieter(); // 8
        cond.seVolumeQuieter(); // 7
        cond.seVolumeQuieter(); // 6
        cond.seVolumeQuieter(); // 5
        cond.seVolumeQuieter(); // 4
        cond.seVolumeQuieter(); // 3
        cond.seVolumeQuieter(); // 2
        cond.seVolumeQuieter(); // 1
        assertEquals(0, cond.getVolumeQuieter());
    }
}