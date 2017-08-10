package beans.ISKO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "isko_doc_attribute", schema = "", catalog = "develop")
public class DocumentAttribute {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "version", nullable = false)
    private BigInteger version;

    @ManyToOne
    @JoinColumn(name = "form_table_id")
    private FormTable formTable;

    @ManyToOne
    @JoinColumn(name = "form_str_id")
    private FormLine formLine;

    @ManyToOne
    @JoinColumn(name = "form_col_id")
    private FormColumn formColumn;

    @ManyToOne
    @JoinColumn(name = "report_form_id")
    private FormReportISKO formReportISKO;

    @Basic
    @Column(name = "disabled", nullable = true)
    private Boolean disabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean isSwitchedOff) {
        this.disabled = isSwitchedOff;
    }

    public FormTable getFormTable() {
        return formTable;
    }

    public void setFormTable(FormTable formTable) {
        this.formTable = formTable;
    }

    public FormLine getFormLine() {
        return formLine;
    }

    public void setFormLine(FormLine formLine) {
        this.formLine = formLine;
    }

    public FormColumn getFormColumn() {
        return formColumn;
    }

    public void setFormColumn(FormColumn formColumn) {
        this.formColumn = formColumn;
    }

    public FormReportISKO getFormReportISKO() {
        return formReportISKO;
    }

    public void setFormReportISKO(FormReportISKO formReportISKO) {
        this.formReportISKO = formReportISKO;
    }

}
