//package beans.verificationBeans;
//
//import beans.ISKO.FormDocument;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import java.math.BigDecimal;
//
//@Entity
//@Table(name = "verification_value_of_indicator", schema = "integrationisko", catalog = "")
//public class VerificationValueOfIndicator {
//
//    @Id
//    @Column(name = "ID", nullable = false)
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name = "INDICATOR_ID")
//    private VerificationIndicator verificationIndicator;
//
//    @ManyToOne
//    @JoinColumn(name = "FORM_DOCUMENT_ID")
//    private FormDocument formDocument;
//
//    @Basic
//    @Column(name = "VALUE_INDICATION_PRPU", nullable = true, precision = 5)
//    private BigDecimal valueIndicationPrpu;
//
//    @Basic
//    @Column(name = "VALUE_INDICATION_ISKO", nullable = true, precision = 5)
//    private BigDecimal valueIndicationIsko;
//
//    @Basic
//    @Column(name = "FLAG_DEVIATION", nullable = true)
//    private Byte flagDeviation;
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public VerificationIndicator getVerificationIndicator() {
//        return verificationIndicator;
//    }
//
//    public void setVerificationIndicator(VerificationIndicator verificationIndicator) {
//        this.verificationIndicator = verificationIndicator;
//    }
//
//    public FormDocument getFormDocument() {
//        return formDocument;
//    }
//
//    public void setFormDocument(FormDocument formDocument) {
//        this.formDocument = formDocument;
//    }
//
//    public BigDecimal getValueIndicationPrpu() {
//        return valueIndicationPrpu;
//    }
//
//    public void setValueIndicationPrpu(BigDecimal valueIndicationPrpu) {
//        this.valueIndicationPrpu = valueIndicationPrpu;
//    }
//
//    public BigDecimal getValueIndicationIsko() {
//        return valueIndicationIsko;
//    }
//
//    public void setValueIndicationIsko(BigDecimal valueIndicationIsko) {
//        this.valueIndicationIsko = valueIndicationIsko;
//    }
//
//    public Byte getFlagDeviation() {
//        return flagDeviation;
//    }
//
//    public void setFlagDeviation(Byte flagDeviation) {
//        this.flagDeviation = flagDeviation;
//    }
//
//}
