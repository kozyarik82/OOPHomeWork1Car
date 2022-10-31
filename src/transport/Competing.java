package transport;

import java.time.LocalTime;

public interface Competing {
    void pitStop();

    void  getBestLapTime();

    void getMaxSpeed();
}
