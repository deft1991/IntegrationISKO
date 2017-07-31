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
import java.sql.Timestamp;

@Entity
@Table(name = "document_value", schema = "integrationisko", catalog = "")
public class DocumentValue {

    @Id
    @Column(name = "ID", nullable = false)
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DOCUMENT_ATTRIBUTE_ID")
    private DocumentAttribute documentAttribute;

    @ManyToOne
    @JoinColumn(name = "FORM_DOCUMENT_ID")
    private FormDocument formDocument;

    @Basic
    @Column(name = "VALUE_LINE", nullable = true)
    private String valueLine;

    @Basic
    @Column(name = "VALUE_NUMBER", nullable = true)
    private Double valueNumber;

    @Basic
    @Column(name = "VALUE_DATE", nullable = true)
    private Timestamp valueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
