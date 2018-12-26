
package com.example.sample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.sample package. 
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

    private final static QName _JaxWsTest1_QNAME = new QName("http://example.com/sample", "jaxWsTest1");
    private final static QName _JaxWsTest1Response_QNAME = new QName("http://example.com/sample", "jaxWsTest1Response");
    private final static QName _UserDefinedFault_QNAME = new QName("http://example.com/sample", "UserDefinedFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.sample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JaxWsTest1 }
     * 
     */
    public JaxWsTest1 createJaxWsTest1() {
        return new JaxWsTest1();
    }

    /**
     * Create an instance of {@link JaxWsTest1Response }
     * 
     */
    public JaxWsTest1Response createJaxWsTest1Response() {
        return new JaxWsTest1Response();
    }

    /**
     * Create an instance of {@link UserDefinedFault }
     * 
     */
    public UserDefinedFault createUserDefinedFault() {
        return new UserDefinedFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxWsTest1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/sample", name = "jaxWsTest1")
    public JAXBElement<JaxWsTest1> createJaxWsTest1(JaxWsTest1 value) {
        return new JAXBElement<JaxWsTest1>(_JaxWsTest1_QNAME, JaxWsTest1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxWsTest1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/sample", name = "jaxWsTest1Response")
    public JAXBElement<JaxWsTest1Response> createJaxWsTest1Response(JaxWsTest1Response value) {
        return new JAXBElement<JaxWsTest1Response>(_JaxWsTest1Response_QNAME, JaxWsTest1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/sample", name = "UserDefinedFault")
    public JAXBElement<UserDefinedFault> createUserDefinedFault(UserDefinedFault value) {
        return new JAXBElement<UserDefinedFault>(_UserDefinedFault_QNAME, UserDefinedFault.class, null, value);
    }

}
