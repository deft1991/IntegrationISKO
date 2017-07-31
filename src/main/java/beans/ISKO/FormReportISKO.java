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
import java.util.Date;

@Entity
@Table(name = "form_report_isko", schema = "integrationisko", catalog = "")
public class FormReportISKO implements Serializable {
    private int id;
    private String formCode;
    private String formName;
    private Date startDate;
    private Date closeDate;
    private Byte isSwitchedOff;

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
    @Column(name = "FORM_CODE", nullable = true, length = 10)
    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    @Basic
    @Column(name = "FORM_NAME", nullable = true, length = 250)
    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    @Column(name = "START_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "CLOSE_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    @Basic
    @Column(name = "IS_SWITCHED_OFF", nullable = true)
    public Byte getIsSwitchedOff() {
        return isSwitchedOff;
    }

    public void setIsSwitchedOff(Byte isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
    }

}
