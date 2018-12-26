
package com.kpbs.productionOrder;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductionOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AUFNR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value=""/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MATNR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GAMNG"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="18"/&gt;
 *               &lt;fractionDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ERNAM"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FEVOR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GSTRS" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="GSUZS" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="MATPF"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionOrder", propOrder = {
    "aufnr",
    "matnr",
    "gamng",
    "ernam",
    "fevor",
    "gstrs",
    "gsuzs",
    "matpf"
})
public class ProductionOrder {

    @XmlElement(name = "AUFNR", required = true)
    protected String aufnr;
    @XmlElement(name = "MATNR", required = true)
    protected String matnr;
    @XmlElement(name = "GAMNG", required = true)
    protected BigDecimal gamng;
    @XmlElement(name = "ERNAM", required = true)
    protected String ernam;
    @XmlElement(name = "FEVOR", required = true)
    protected String fevor;
    @XmlElement(name = "GSTRS", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gstrs;
    @XmlElement(name = "GSUZS", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar gsuzs;
    @XmlElement(name = "MATPF", required = true)
    protected String matpf;

    /**
     * Gets the value of the aufnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUFNR() {
        return aufnr;
    }

    /**
     * Sets the value of the aufnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUFNR(String value) {
        this.aufnr = value;
    }

    /**
     * Gets the value of the matnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Sets the value of the matnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * Gets the value of the gamng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGAMNG() {
        return gamng;
    }

    /**
     * Sets the value of the gamng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGAMNG(BigDecimal value) {
        this.gamng = value;
    }

    /**
     * Gets the value of the ernam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERNAM() {
        return ernam;
    }

    /**
     * Sets the value of the ernam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERNAM(String value) {
        this.ernam = value;
    }

    /**
     * Gets the value of the fevor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEVOR() {
        return fevor;
    }

    /**
     * Sets the value of the fevor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEVOR(String value) {
        this.fevor = value;
    }

    /**
     * Gets the value of the gstrs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGSTRS() {
        return gstrs;
    }

    /**
     * Sets the value of the gstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGSTRS(XMLGregorianCalendar value) {
        this.gstrs = value;
    }

    /**
     * Gets the value of the gsuzs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGSUZS() {
        return gsuzs;
    }

    /**
     * Sets the value of the gsuzs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGSUZS(XMLGregorianCalendar value) {
        this.gsuzs = value;
    }

    /**
     * Gets the value of the matpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATPF() {
        return matpf;
    }

    /**
     * Sets the value of the matpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATPF(String value) {
        this.matpf = value;
    }

    @Override
    public String toString() {
        return "ProductionOrder{" +
                "aufnr='" + aufnr + '\'' +
                ", matnr='" + matnr + '\'' +
                ", gamng=" + gamng +
                ", ernam='" + ernam + '\'' +
                ", fevor='" + fevor + '\'' +
                ", gstrs=" + gstrs +
                ", gsuzs=" + gsuzs +
                ", matpf='" + matpf + '\'' +
                '}';
    }
}
