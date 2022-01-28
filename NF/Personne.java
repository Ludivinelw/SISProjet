package NF;

public class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
