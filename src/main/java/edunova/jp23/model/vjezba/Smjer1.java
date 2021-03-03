package edunova.jp23.model.vjezba;


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author mbralic
 */
@Entity
@Table(name="smjer")
public class Smjer1 extends Entitet{


    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String naziv;
    @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal cijena;
    private Integer trajanje;
    @Column(columnDefinition = "tinyint(1)")
    private Boolean verificiran;


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Boolean getVerificiran() {
        return verificiran;
    }

    public void setVerificiran(Boolean verificiran) {
        this.verificiran = verificiran;
    }





}

