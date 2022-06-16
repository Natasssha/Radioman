import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 9;

        @Test
        void shouldMaxCurrentStation() {
            Radio cond = new Radio( 7,  100,  minStation,  maxStation,  minVolume,  maxVolume);
            int expected = 8;
            cond.setCurrentStation(expected);
            assertEquals(expected, cond.getCurrentStation());
        }


        @Test
        void shouldMinCurrentStation() {
            Radio cond = new Radio( 5,  100,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentStation(100);
            int expected = 5;
            assertEquals(expected, cond.getCurrentStation());
        }

        @Test
        void shouldCurrentStationUp() {
            Radio cond = new Radio( 7,  100,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentStation(-100);
            int expected = 7;
            assertEquals(expected, cond.getCurrentStation());
        }
    @Test
    void shouldCurrentStationUp1() {
        Radio cond = new Radio( 7,  100,  minStation,  maxStation,  minVolume,  maxVolume);
        cond.setCurrentStation(1);
        int expected = 1;
        assertEquals(expected, cond.getCurrentStation());
    }
    @Test
    void shouldCurrentStationUp2() {
        Radio cond = new Radio( 2,  100,  minStation,  maxStation,  minVolume,  maxVolume);
        cond.setCurrentStation(5);
        int expected = 5;
        assertEquals(expected, cond.getCurrentStation());
    }

        @Test
        void shouldMaxCurrentVolume() {
            Radio cond = new Radio( 0,  0,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentVolume(101);
            int expected = 0;
            assertEquals(expected, cond.getCurrentVolume());
        }

        @Test
        void shouldMinCurrentVolume() {
            Radio cond = new Radio( 100,  0,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentVolume(-100);
            int expected = 0;
            assertEquals(expected, cond.getCurrentVolume());
        }


        @Test
        void shouldCurrentVolumeQuieter() {
            Radio cond = new Radio( 100,  100,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentVolume(88);
            int expected = 88;
            assertEquals(expected, cond.getCurrentVolume());
        }

        @Test
        void shouldCurrentVolumeLouder() {
            Radio cond = new Radio( 100,  0,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setCurrentVolume(100);
            int expected = 100;
            assertEquals(expected, cond.getCurrentVolume());
        }

        @Test
        void shouldStationUp() {
            Radio cond = new Radio( 0,  100,  minStation,  maxStation,  minVolume,  maxVolume);
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
            Radio cond = new Radio( 0,  100,  minStation,  maxStation,  minVolume,  maxVolume);
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
            Radio cond = new Radio( 100,  98,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.setVolumeLouder(); // 98
            cond.setVolumeLouder(); // 99
            cond.setVolumeLouder(); // 100
            cond.setVolumeLouder(); // 100
            assertEquals(100, cond.getVolumeLouder());
        }

        @Test
        void shouldVolumeQuieter() {
            Radio cond = new Radio( 100,  5,  minStation,  maxStation,  minVolume,  maxVolume);
            cond.seVolumeQuieter(); // 5
            cond.seVolumeQuieter(); // 4
            cond.seVolumeQuieter(); // 3
            cond.seVolumeQuieter(); // 2
            cond.seVolumeQuieter(); // 1
            cond.seVolumeQuieter(); // 0
            assertEquals(0, cond.getVolumeQuieter());
        }
    }
