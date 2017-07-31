package beans.ISKO;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "form_document", schema = "integrationisko", catalog = "")
public class FormDocument implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private int id;

    @ManyToOne
    @JoinColumn(name = "REPORT_FORM_ISKO_ID")
    private FormReportISKO formReportISKO;

    @Column(name = "CHANGE_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date changeDate;

    @Column(name = "START_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Basic
    @Column(name = "REGION", nullable = true)
    private Integer region;

    @Basic
    @Column(name = "IDENTIFI_RECORD_DOC_ISKO", nullable = true)
    private Integer identifiRecordDocIsko;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FormReportISKO getFormReportISKO() {
        return formReportISKO;
    }

    public void setFormReportISKO(FormReportISKO formReportISKO) {
        this.formReportISKO = formReportISKO;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getIdentifiRecordDocIsko() {
        return identifiRecordDocIsko;
    }

    public void setIdentifiRecordDocIsko(Integer identifiRecordDocIsko) {
        this.identifiRecordDocIsko = identifiRecordDocIsko;
    }

}
