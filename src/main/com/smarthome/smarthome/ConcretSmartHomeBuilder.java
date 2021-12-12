package main.com.smarthome.smarthome;

import main.com.smarthome.remote.RemoteControl;

public class ConcretSmartHomeBuilder implements SmartHomeBuilder{
    private String nom;
    private int numero;
    private Adresse adresse;
    private RemoteControl remoteControl;

    public ConcretSmartHomeBuilder(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    @Override
    public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
        return this;
    }

    @Override
    public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
        this.adresse = adresse;
        return this;
    }

    public SmartHome build() {
        SmartHome smarthome = new SmartHome();
        smarthome.setNom(nom);
        smarthome.setNumero(numero);
        smarthome.setAdresse(adresse);
        smarthome.setRemoteControl(remoteControl);
        return smarthome;
    }
}
