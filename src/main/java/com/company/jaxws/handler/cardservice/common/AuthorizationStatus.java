
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
 *         &lt;element name="authorizationToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "authorizationToken",
    "authorized",
    "errorCode"
})
@XmlRootElement(name = "AuthorizationStatus")
public class AuthorizationStatus {

    @XmlElement(required = true, nillable = true)
    protected String authorizationToken;
    protected boolean authorized;
    protected int errorCode;

    /**
     * Gets the value of the authorizationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * Sets the value of the authorizationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationToken(String value) {
        this.authorizationToken = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     */
    public boolean isAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     */
    public void setAuthorized(boolean value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

}
