package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "isko_form_col", schema = "", catalog = "develop")
public class FormColumn {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "version", nullable = false)
    private BigInteger version;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "code", nullable = true, length = 10)
    private String code;

    @Basic
    @Column(name = "disabled", nullable = true)
    private Boolean disabled;

    @Basic
    @Column(name = "ord", nullable = true)
    private Integer order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean isSwitchedOff) {
        this.disabled = isSwitchedOff;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

}
