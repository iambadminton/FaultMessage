
package com.kpbs.productionOrder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kpbs.productionOrder package. 
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

    private final static QName _SaveProductionOrderFault_QNAME = new QName("http://esb.z-t-z.ru/Integration/SAP", "SaveProductionOrderFault");
    private final static QName _ProductionOrder_QNAME = new QName("http://esb.z-t-z.ru/Integration/SAP", "ProductionOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kpbs.productionOrder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveProductionOrderFault }
     * 
     */
    public SaveProductionOrderFault createSaveProductionOrderFault() {
        return new SaveProductionOrderFault();
    }

    /**
     * Create an instance of {@link ProductionOrder }
     * 
     */
    public ProductionOrder createProductionOrder() {
        return new ProductionOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProductionOrderFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.z-t-z.ru/Integration/SAP", name = "SaveProductionOrderFault")
    public JAXBElement<SaveProductionOrderFault> createSaveProductionOrderFault(SaveProductionOrderFault value) {
        return new JAXBElement<SaveProductionOrderFault>(_SaveProductionOrderFault_QNAME, SaveProductionOrderFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.z-t-z.ru/Integration/SAP", name = "ProductionOrder")
    public JAXBElement<ProductionOrder> createProductionOrder(ProductionOrder value) {
        return new JAXBElement<ProductionOrder>(_ProductionOrder_QNAME, ProductionOrder.class, null, value);
    }

}
