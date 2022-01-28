package NF;

import java.util.Date;

public class Patient extends Personne {

    private String adresse;
    private String id;
    private Date dateDeNaissance;

    public Patient(String nom, String prenom, String adresse, String id, Date dateDeNaissance) {
        super(nom, prenom);
        this.dateDeNaissance = dateDeNaissance;
        this.id = id;
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}
