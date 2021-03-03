package edunova.jp23.model.vjezba;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="predavac")
public class Predavac1 extends Entitet{

    @ManyToOne
    @JoinColumn(name = "osoba", nullable = false)
    private Osoba1 osoba1;

    @Column(columnDefinition = "varchar(50)")
    private String iban;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

}

