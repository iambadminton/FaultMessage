
package com.kpbs.productionOrder;

import javax.xml.soap.SOAPFault;
import javax.xml.ws.WebFault;
import javax.xml.ws.soap.SOAPFaultException;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-21T16:49:35.952+03:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "SaveProductionOrderFault", targetNamespace = "http://esb.z-t-z.ru/Integration/SAP")
public class ProductionOrderSaveException extends Exception {

    private com.kpbs.productionOrder.SaveProductionOrderFault saveProductionOrderFault;

    public ProductionOrderSaveException() {
        super();
    }

    public ProductionOrderSaveException(String message) {
        super(message);
    }

    public ProductionOrderSaveException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ProductionOrderSaveException(String message, com.kpbs.productionOrder.SaveProductionOrderFault saveProductionOrderFault) {
        super(message);
        this.saveProductionOrderFault = saveProductionOrderFault;
    }

    public ProductionOrderSaveException(String message, com.kpbs.productionOrder.SaveProductionOrderFault saveProductionOrderFault, java.lang.Throwable cause) {
        super(message, cause);
        this.saveProductionOrderFault = saveProductionOrderFault;
    }

    public com.kpbs.productionOrder.SaveProductionOrderFault getFaultInfo() {
        return this.saveProductionOrderFault;
    }
}

/*
@WebFault(name = "SaveProductionOrderFault", targetNamespace = "http://esb.z-t-z.ru/Integration/SAP")
public class ProductionOrderSaveException extends SOAPFaultException {
    public ProductionOrderSaveException(SOAPFault fault) {
        super(fault);
    }

    @Override
    public SOAPFault getFault() {
        return super.getFault();
    }
}*/

