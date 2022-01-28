package NF;

import java.util.ArrayList;

public class DMR {
    private int numArchivage;
    private Patient patient;
    private ArrayList<Examen> examens;
    private Sexe sexe;

    public DMR(Patient patient, Sexe sexe, int numArchivage){
        this.patient = patient;
        this.sexe = sexe;
        this.numArchivage = numArchivage;
        examens = new ArrayList<Examen>();
    }

    public void addExamen(Examen e){

    }

    public void removeExamen(Examen e){
        
    }
}
