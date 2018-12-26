
package com.company.jaxws.handler.cardservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCard" type="{http://cardservice.handler.jaxws.company.com/creditcard}CreditCard"/&gt;
 *         &lt;element name="CardUser" type="{http://cardservice.handler.jaxws.company.com/creditcard}CardUser"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "cardUser"
})
@XmlRootElement(name = "AuthorizationRequest")
public class AuthorizationRequest {

    @XmlElement(name = "CreditCard", required = true, nillable = true)
    protected CreditCard creditCard;
    @XmlElement(name = "CardUser", required = true, nillable = true)
    protected CardUser cardUser;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the cardUser property.
     * 
     * @return
     *     possible object is
     *     {@link CardUser }
     *     
     */
    public CardUser getCardUser() {
        return cardUser;
    }

    /**
     * Sets the value of the cardUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardUser }
     *     
     */
    public void setCardUser(CardUser value) {
        this.cardUser = value;
    }

    @Override
    public String toString() {
        return "AuthorizationRequest{" +
                "creditCard=" + creditCard.toString() +
                ", cardUser=" + cardUser.toString() +
                '}';
    }
}
