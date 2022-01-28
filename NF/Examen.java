package NF;

import java.util.Date;
import java.util.concurrent.CompletableFuture;

public class Examen {
    private String nomPH;
    private String lienPacs;
    private Date date;
    private CompteRendu compteRendu;
    private TypeExamen typeExamen;

    public Examen(String nomPH, String lienPacs,TypeExamen typeExamen, Date date, CompteRendu compteRendu){
        this.nomPH = nomPH;
        this.lienPacs = lienPacs;
        this.date = date;
        this.compteRendu = compteRendu;
        this.typeExamen = typeExamen;
    }

    public TypeExamen getTypeExamen() {
        return typeExamen;
    }

    public void setTypeExamen(TypeExamen typeExamen) {
        this.typeExamen = typeExamen;
    }

    public String getNomPH() {
        return nomPH;
    }

    public void setNomPH(String nomPH) {
        this.nomPH = nomPH;
    }

    public String getLienPacs() {
        return lienPacs;
    }

    public void setLienPacs(String lienPacs) {
        this.lienPacs = lienPacs;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CompteRendu getCompteRendu() {
        return compteRendu;
    }

    public void setCompteRendu(CompteRendu compteRendu) {
        this.compteRendu = compteRendu;
    }
}
