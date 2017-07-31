package beans.verificationBeans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;

@Entity
@Table(name = "verification_calculation_reviews", schema = "integrationisko", catalog = "")
public class VerificationCalculationReviews {
    private int id;
    private Integer regionId;
    private Timestamp calculateDate;
    private Timestamp adoptionDocDate;
    private Timestamp fixReviewDate;
    private String autorReview;
    private Integer year;
    private Integer mounth;
    private Byte flagDelete;
    private String note;
    private Timestamp startPeriodDate;
    private Timestamp endPeriodDate;
    private Byte flagDeviation;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "REGION_ID", nullable = true)
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Column(name = "CALCULATE_DATE", nullable = true)
    public Timestamp getCalculateDate() {
        return calculateDate;
    }

    public void setCalculateDate(Timestamp calculateDate) {
        this.calculateDate = calculateDate;
    }

    @Column(name = "ADOPTION_DOC_DATE", nullable = true)
    public Timestamp getAdoptionDocDate() {
        return adoptionDocDate;
    }

    public void setAdoptionDocDate(Timestamp adoptionDocDate) {
        this.adoptionDocDate = adoptionDocDate;
    }

    @Column(name = "FIX_REVIEW_DATE", nullable = true)
    public Timestamp getFixReviewDate() {
        return fixReviewDate;
    }

    public void setFixReviewDate(Timestamp fixReviewDate) {
        this.fixReviewDate = fixReviewDate;
    }

    @Basic
    @Column(name = "AUTOR_REVIEW", nullable = true, length = 100)
    public String getAutorReview() {
        return autorReview;
    }

    public void setAutorReview(String autorReview) {
        this.autorReview = autorReview;
    }

    @Basic
    @Column(name = "YEAR", nullable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "MOUNTH", nullable = true)
    public Integer getMounth() {
        return mounth;
    }

    public void setMounth(Integer mounth) {
        this.mounth = mounth;
    }

    @Basic
    @Column(name = "FLAG_DELETE", nullable = true)
    public Byte getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Byte flagDelete) {
        this.flagDelete = flagDelete;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 1000)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column(name = "START_PERIOD_DATE", nullable = true)
    public Timestamp getStartPeriodDate() {
        return startPeriodDate;
    }

    public void setStartPeriodDate(Timestamp startPeriodDate) {
        this.startPeriodDate = startPeriodDate;
    }

    @Column(name = "END_PERIOD_DATE", nullable = true)
    public Timestamp getEndPeriodDate() {
        return endPeriodDate;
    }

    public void setEndPeriodDate(Timestamp endPeriodDate) {
        this.endPeriodDate = endPeriodDate;
    }

    @Basic
    @Column(name = "FLAG_DEVIATION", nullable = true)
    public Byte getFlagDeviation() {
        return flagDeviation;
    }

    public void setFlagDeviation(Byte flagDeviation) {
        this.flagDeviation = flagDeviation;
    }

}
