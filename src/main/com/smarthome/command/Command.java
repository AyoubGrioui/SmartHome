package main.com.smarthome.command;

public interface Command {
    String execute();

    String undo();
}
