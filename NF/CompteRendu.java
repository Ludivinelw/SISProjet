package NF;

import java.util.Date;

public class CompteRendu {
    private String contenu;
    private Date dateExam;

    public CompteRendu(String contenu, Date dateExam){
        this.contenu = contenu;
        this.dateExam = dateExam;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public void setDateExam(Date dateExam) {
        this.dateExam = dateExam;
    }
}
