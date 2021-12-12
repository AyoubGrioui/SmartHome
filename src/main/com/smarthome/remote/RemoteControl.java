package main.com.smarthome.remote;

import main.com.smarthome.command.Command;
import main.com.smarthome.command.TurnOff;
import main.com.smarthome.command.TurnOn;
import main.com.smarthome.device.Device;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undo;
    private List<String> report;

    public RemoteControl(int nbrSlot) {
        onCommand = new Command[nbrSlot];
        offCommand = new Command[nbrSlot];
        this.report = new ArrayList<>();
    }

    public void init(Device... devices) {
        for (int i = 0; i < devices.length; i++) {
            onCommand[i] = new TurnOn(devices[i]);
            offCommand[i] = new TurnOff(devices[i]);
        }
    }

    public void onButtonPressed(int slot) {
        String on = onCommand[slot].execute();
        undo = onCommand[slot];
        report.add(on);
    }

    public void offButtonPressed(int slot) {
        String off = offCommand[slot].execute();
        undo = offCommand[slot];
        report.add(off);
    }

    public void undo() {
        undo.undo();
    }

    public List<String> getReport() {
        return report;
    }
}
