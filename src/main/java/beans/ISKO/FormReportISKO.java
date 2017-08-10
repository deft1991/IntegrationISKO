package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "isko_report_form", schema = "", catalog = "develop")
public class FormReportISKO implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "version", nullable = true, length = 10)
    private BigInteger version;

    @Basic
    @Column(name = "code", nullable = true, length = 10)
    private String formCode;

    @Basic
    @Column(name = "name", nullable = true, length = 250)
    private String formName;

    @Column(name = "begin_date", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "end_date", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date closeDate;

    @Basic
    @Column(name = "disabled", nullable = true)
    private Boolean isSwitchedOff;

    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Boolean getIsSwitchedOff() {
        return isSwitchedOff;
    }

    public void setIsSwitchedOff(Boolean isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
    }

}
