
package com.company.jaxws.handler.cardservice.common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.jaxws.handler.cardservice.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.jaxws.handler.cardservice.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link AuthorizationRequest }
     * 
     */
    public AuthorizationRequest createAuthorizationRequest() {
        return new AuthorizationRequest();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link CardUser }
     * 
     */
    public CardUser createCardUser() {
        return new CardUser();
    }

    /**
     * Create an instance of {@link AuthorizationStatus }
     * 
     */
    public AuthorizationStatus createAuthorizationStatus() {
        return new AuthorizationStatus();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

}
