package main.com.smarthome.smarthome;

import main.com.smarthome.remote.RemoteControl;

public interface SmartHomeBuilder {
    SmartHomeBuilder withRemoteControl(RemoteControl remoteControl);
    SmartHomeBuilder withAdresse(Adresse adresse);
}
