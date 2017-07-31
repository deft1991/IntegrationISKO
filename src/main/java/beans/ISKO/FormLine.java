package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "form_line", schema = "integrationisko", catalog = "")
public class FormLine {
    private int id;
    private Integer number;
    private String name;
    private String code;
    private Byte isSwitchOff;
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
    @Column(name = "NUMBER", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 1000)
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
    @Column(name = "IS_SWITCH_OFF", nullable = true)
    public Byte getIsSwitchOff() {
        return isSwitchOff;
    }

    public void setIsSwitchOff(Byte isSwitchOff) {
        this.isSwitchOff = isSwitchOff;
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
