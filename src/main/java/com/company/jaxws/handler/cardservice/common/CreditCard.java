
package com.company.jaxws.handler.cardservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccvNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billingAddress" type="{http://cardservice.handler.jaxws.company.com/creditcard}Address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
    "cardNumber",
    "ccvNumber",
    "billingAddress"
})
public class CreditCard {

    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true)
    protected String ccvNumber;
    @XmlElement(required = true, nillable = true)
    protected Address billingAddress;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the ccvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcvNumber() {
        return ccvNumber;
    }

    /**
     * Sets the value of the ccvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcvNumber(String value) {
        this.ccvNumber = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", ccvNumber='" + ccvNumber + '\'' +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
