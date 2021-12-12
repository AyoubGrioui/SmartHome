package main.com.smarthome.command;

import main.com.smarthome.device.Device;

public class TurnOff implements Command{

    Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOff();
    }

    @Override
    public String undo() {
        return device.turnOn();
    }
}
