package main.com.smarthome.smarthome;

import main.com.smarthome.remote.RemoteControl;

public class SmartHome {
    private String nom;
    private int numero;
    private Adresse adresse;
    private RemoteControl remoteControl;

    public SmartHome(String nom, int numero, Adresse adresse, RemoteControl remoteControl) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
        this.remoteControl = remoteControl;
    }

    public SmartHome() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        for (String str : remoteControl.getReport()) {
            sb.append(str).append("-");
        }

        return sb.toString();
    }
}
