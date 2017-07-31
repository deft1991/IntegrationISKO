package beans.verificationBeans;

import beans.ISKO.DocumentAttribute;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "verification_indicator", schema = "integrationisko", catalog = "")
public class VerificationIndicator {
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Basic
    @Column(name = "NAME", nullable = true, length = 250)
    private String name;

    @ManyToOne
    @JoinColumn(name = "DOCUMENT_ATTRIBUTE_ID")
    private DocumentAttribute documentAttribute;

    @Basic
    @Column(name = "PROC_OF_CALCULATION_PRPU", nullable = true, length = 250)
    private String procOfCalculationPrpu;

    @Basic
    @Column(name = "START_ACTIVITY", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date startActivity;

    @Basic
    @Column(name = "END_ACTIVITY", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date endActivity;

    @Basic
    @Column(name = "SORTING_ORDER", nullable = true)
    private Integer sortingOrder;

    @Basic
    @Column(name = "FLAG_NOT_ACTIVITY", nullable = true)
    private Byte flagNotActivity;

    @Basic
    @Column(name = "FULL_NAME", nullable = true, length = 1000)
    private String fullName;

    @Basic
    @Column(name = "CODE", nullable = true, length = 10)
    private String code;


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

    public DocumentAttribute getDocumentAttribute() {
        return documentAttribute;
    }

    public void setDocumentAttribute(DocumentAttribute documentAttribute) {
        this.documentAttribute = documentAttribute;
    }

    public String getProcOfCalculationPrpu() {
        return procOfCalculationPrpu;
    }

    public void setProcOfCalculationPrpu(String procOfCalculationPrpu) {
        this.procOfCalculationPrpu = procOfCalculationPrpu;
    }

    public Date getStartActivity() {
        return startActivity;
    }

    public void setStartActivity(Date startActivity) {
        this.startActivity = startActivity;
    }


    public Date getEndActivity() {
        return endActivity;
    }

    public void setEndActivity(Date endActivity) {
        this.endActivity = endActivity;
    }


    public Integer getSortingOrder() {
        return sortingOrder;
    }

    public void setSortingOrder(Integer sortingOrder) {
        this.sortingOrder = sortingOrder;
    }


    public Byte getFlagNotActivity() {
        return flagNotActivity;
    }

    public void setFlagNotActivity(Byte flagNotActivity) {
        this.flagNotActivity = flagNotActivity;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
