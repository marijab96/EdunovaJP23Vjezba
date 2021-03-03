package edunova.jp23.model.vjezba;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="polaznik")
public class Polaznik1 extends Entitet{

    @ManyToOne
    @JoinColumn(name = "osoba", nullable = false)

    private Osoba1 osoba1;

    @Column(columnDefinition = "varchar(50)")
    private String brojugovora;

    public Osoba1 getOsoba1() {
        return osoba1;
    }

    public void setOsoba1(Osoba1 osoba1) {
        this.osoba1 = osoba1;
    }

    public String getBrojugovora() {
        return brojugovora;
    }

    public void setBrojugovora(String brojugovora) {
        this.brojugovora = brojugovora;
    }



}

