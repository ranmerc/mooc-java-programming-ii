package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public boolean isOn() {
        if (sensors.size() == 0) {
            return false;
        }

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor has no sensor or isn't turned on.");
        }

        int sumOfTemps = sensors.stream()
                .map(sensor -> sensor.read())
                .reduce(0, (value, sum) -> value + sum);

        int reading = sumOfTemps / sensors.size();

        readings.add(reading);

        return reading;
    }
}
