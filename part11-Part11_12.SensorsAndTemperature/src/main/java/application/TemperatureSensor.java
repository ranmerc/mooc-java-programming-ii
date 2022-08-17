package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public int read() {
        if (state == false) {
            throw new IllegalStateException("Sensor is off. Cannot be read.");
        }

        return (new Random().nextInt(61)) - 30;
    }
}
