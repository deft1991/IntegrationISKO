package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "form_table", schema = "integrationisko", catalog = "")
public class FormTable {
    private int id;
    private String name;
    private String code;
    private Byte isSwichedOff;
    private Integer order;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 250)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CODE", nullable = true, length = 10)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "IS_SWICHED_OFF", nullable = true)
    public Byte getIsSwichedOff() {
        return isSwichedOff;
    }

    public void setIsSwichedOff(Byte isSwichedOff) {
        this.isSwichedOff = isSwichedOff;
    }

    @Basic
    @Column(name = "ORDER", nullable = true)
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

}
