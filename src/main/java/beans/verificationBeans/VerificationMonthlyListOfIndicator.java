package beans.verificationBeans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "verification_monthly_list_of_indicator", schema = "integrationisko", catalog = "")
public class VerificationMonthlyListOfIndicator {
    private int id;
    private VerificationIndicator indicator;
    private Integer year;
    private Integer mounth;
    private Integer flagNotActivity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "INDICATOR_ID")
    public VerificationIndicator getIndicator() {
        return indicator;
    }

    public void setIndicator(VerificationIndicator indicator) {
        this.indicator = indicator;
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
    @Column(name = "FLAG_NOT_ACTIVITY", nullable = true)
    public Integer getFlagNotActivity() {
        return flagNotActivity;
    }

    public void setFlagNotActivity(Integer flagNotActivity) {
        this.flagNotActivity = flagNotActivity;
    }

}