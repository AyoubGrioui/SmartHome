package main.com.smarthome.smarthome;

public class Adresse {
    private Long id;
    private String ville;

    public Adresse(Long id, String ville) {
        this.id = id;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
