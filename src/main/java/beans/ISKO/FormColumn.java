package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "form_column", schema = "integrationisko", catalog = "")
public class FormColumn {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "NAME", nullable = false)
    private String name;

    @Basic
    @Column(name = "CODE", nullable = true, length = 10)
    private String code;

    @Basic
    @Column(name = "IS_SWITCHED_OFF", nullable = true)
    private Boolean isSwitchedOff;

    @Basic
    @Column(name = "ORDER", nullable = true)
    private Integer order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Boolean getIsSwitchedOff() {
        return isSwitchedOff;
    }

    public void setIsSwitchedOff(Boolean isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

}
