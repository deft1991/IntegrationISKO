package beans.ISKO;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_rgn", schema = "integrationisko", catalog = "")
public class RefRgn {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "version")
    private Integer version;

    @Basic
    @Column(name = "code")
    private Integer code;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "okato")
    private Integer okato;

    @Basic
    @Column(name = "talon")
    private Integer talon;

    @Basic
    @Column(name = "kpy")
    private Integer kpy;

    @Basic
    @Column(name = "shortname")
    private String shortname;

    @Basic
    @Column(name = "capital")
    private String capital;

    @Basic
    @Column(name = "okato5")
    private Integer okato5;

    @Basic
    @Column(name = "is_disabled")
    private Boolean is_disabled;

    @Basic
    @Column(name = "is_federal")
    private Boolean is_federal;

    @Basic
    @Column(name = "code_ifns")
    private Integer code_ifns;

    @Basic
    @Column(name = "sorting_order")
    private Integer sorting_order;

    @Basic
    @Column(name = "fdo_id")
    private Integer fdo_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOkato() {
        return okato;
    }

    public void setOkato(Integer okato) {
        this.okato = okato;
    }

    public Integer getTalon() {
        return talon;
    }

    public void setTalon(Integer talon) {
        this.talon = talon;
    }

    public Integer getKpy() {
        return kpy;
    }

    public void setKpy(Integer kpy) {
        this.kpy = kpy;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getOkato5() {
        return okato5;
    }

    public void setOkato5(Integer okato5) {
        this.okato5 = okato5;
    }

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
    }

    public Boolean getIs_federal() {
        return is_federal;
    }

    public void setIs_federal(Boolean is_federal) {
        this.is_federal = is_federal;
    }

    public Integer getCode_ifns() {
        return code_ifns;
    }

    public void setCode_ifns(Integer code_ifns) {
        this.code_ifns = code_ifns;
    }

    public Integer getSorting_order() {
        return sorting_order;
    }

    public void setSorting_order(Integer sorting_order) {
        this.sorting_order = sorting_order;
    }

    public Integer getFdo_id() {
        return fdo_id;
    }

    public void setFdo_id(Integer fdo_id) {
        this.fdo_id = fdo_id;
    }
}
