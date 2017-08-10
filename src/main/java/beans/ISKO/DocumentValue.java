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
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "isko_doc_value", schema = "", catalog = "develop")
public class DocumentValue {

    @Id
    @Column(name = "ID", nullable = false)
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private int id;

    @Basic
    @Column(name = "version", nullable = true)
    private BigInteger version;

    @ManyToOne
    @JoinColumn(name = "doc_attr_id")
    private DocumentAttribute documentAttribute;

    @ManyToOne
    @JoinColumn(name = "form_doc_id")
    private FormDocument formDocument;

    @Basic
    @Column(name = "value_str", nullable = true)
    private String valueLine;

    @Basic
    @Column(name = "value_num", nullable = true)
    private Double valueNumber;

    @Basic
    @Column(name = "value_date", nullable = true)
    private Timestamp valueDate;

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

    public DocumentAttribute getDocumentAttribute() {
        return documentAttribute;
    }

    public void setDocumentAttribute(DocumentAttribute documentAttribute) {
        this.documentAttribute = documentAttribute;
    }

    public FormDocument getFormDocument() {
        return formDocument;
    }

    public void setFormDocument(FormDocument formDocument) {
        this.formDocument = formDocument;
    }

    public String getValueLine() {
        return valueLine;
    }

    public void setValueLine(String valueLine) {
        this.valueLine = valueLine;
    }

    public Double getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(Double valueNumber) {
        this.valueNumber = valueNumber;
    }

    public Timestamp getValueDate() {
        return valueDate;
    }

    public void setValueDate(Timestamp valueDate) {
        this.valueDate = valueDate;
    }

}
