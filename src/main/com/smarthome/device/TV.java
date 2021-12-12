package main.com.smarthome.device;

public class TV implements Device{
    @Override
    public String turnOn() {
        return "TV On";
    }

    @Override
    public String turnOff() {
        return "TV Off";
    }
}
