package main.com.smarthome.command;

import main.com.smarthome.device.Device;

public class TurnOn implements Command{

    Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOn();
    }

    @Override
    public String undo() {
        return device.turnOff();
    }
}
