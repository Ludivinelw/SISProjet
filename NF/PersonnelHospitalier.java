package NF;

public class PersonnelHospitalier extends Personne{
    private String login;
    private String mdp;

    public PersonnelHospitalier(String nom, String prenom, String login, String mdp) {
        super(nom, prenom);
        this.login = login;
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
