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

@Entity
@Table(name = "document_attribute", schema = "integrationisko", catalog = "")
public class DocumentAttribute {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "FORM_TABLE_ID")
    private FormTable formTable;

    @ManyToOne
    @JoinColumn(name = "FORM_LINE_ID")
    private FormLine formLine;

    @ManyToOne
    @JoinColumn(name = "FORM_COLUMN_ID")
    private FormColumn formColumn;

    @ManyToOne
    @JoinColumn(name = "FORM_REPORT_ISKO_ID")
    private FormReportISKO formReportISKO;

    @Basic
    @Column(name = "IS_SWITCHED_OFF", nullable = true)
    private Boolean isSwitchedOff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Boolean getIsSwitchedOff() {
        return isSwitchedOff;
    }

    public void setIsSwitchedOff(Boolean isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
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
