package edunova.jp23.model.vjezba;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author mbralic
 */
@Entity
@Table(name="grupa")
public class Grupa1 extends Entitet{

    @JoinTable(name = "grupa")
    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String naziv;
    @ManyToOne
    @JoinColumn(name = "smjer", nullable = false)
    private Smjer1 smjer1;
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac1 predavac1;
    private Date datumpocetka;
    @Column(nullable = false)
    private Integer brojpolaznika;

    @ManyToMany
    @JoinTable(name = "clan",
            joinColumns = { @JoinColumn(name = "grupa") },
            inverseJoinColumns = { @JoinColumn(name = "polaznik") } )
    private List<Polaznik1> polaznici1;

    public Grupa1() {
        this.polaznici1 = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer1 getSmjer1() {
        return smjer1;
    }

    public void setSmjer1(Smjer1 smjer1) {
        this.smjer1 = smjer1;
    }

    public Predavac1 getPredavac1() {
        return predavac1;
    }

    public void setPredavac1(Predavac1 predavac1) {
        this.predavac1 = predavac1;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public Integer getBrojpolaznika() {
        return brojpolaznika;
    }

    public void setBrojpolaznika(Integer brojpolaznika) {
        this.brojpolaznika = brojpolaznika;
    }



    public List<Polaznik1> getPolaznici1() {
        return polaznici1;
    }

    public void setPolaznici1(List<Polaznik1> polaznici1) {
        this.polaznici1 = polaznici1;
    }









}
