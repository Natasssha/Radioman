import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldCurrentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);
        assertEquals(0, cond.getCurrentStation());
    }


    @Test
    void shouldCurrentStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        assertEquals(9, cond.getCurrentStation());
    }

    @Test
    void shouldCurrentStation3() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);
        assertEquals(8, cond.getCurrentStation());
    }

    @Test
    void shouldCurrentStation4() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        assertEquals(0, cond.getCurrentStation());
    }

    @Test
    void shouldCurrentStation5() {
        Radio cond = new Radio();
        cond.setCurrentStation(1);
        assertEquals(1, cond.getCurrentStation());
    }

    @Test
    void shouldCurrentStation6() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);
        assertEquals(0, cond.getCurrentStation());
    }

    @Test
    void shouldMaxCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);
        int expected = 0;
        assertEquals(expected, cond.getCurrentVolume());
    }

    @Test
    void shouldMinCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-100);
        assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    void shouldMinCurrentVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    void shouldCurrentVolumeQuieter() {
        Radio cond = new Radio();
        cond.setCurrentVolume(88);
        assertEquals(88, cond.getCurrentVolume());
    }

    @Test
    void shouldCurrentVolumeLouder() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    void shouldStationUp() {
        Radio cond = new Radio(10);
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
        Radio cond = new Radio(10);
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
        cond.setStationDown(); // 0
        assertEquals(9, cond.getStationDown());
    }

    @Test
    void shouldVolumeLouder() {
        Radio cond = new Radio();
        cond.setCurrentVolume(98);
        cond.setVolumeLouder(); // 98
        cond.setVolumeLouder(); // 99
        cond.setVolumeLouder(); // 100
        cond.setVolumeLouder(); // 100
        assertEquals(100, cond.getVolumeLouder());
    }

    @Test
    void shouldVolumeQuieter() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        cond.seVolumeQuieter(); // 5
        cond.seVolumeQuieter(); // 4
        cond.seVolumeQuieter(); // 3
        cond.seVolumeQuieter(); // 2
        cond.seVolumeQuieter(); // 1
        cond.seVolumeQuieter(); // 0
        assertEquals(0, cond.getVolumeQuieter());
    }
}