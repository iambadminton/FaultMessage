package com.kpbs.productionOrder;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class ProductionOrderChainHandler  implements SOAPHandler<SOAPMessageContext> {
    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("==> ProductionOrderChainHandler:handleMessage <==");
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("==> ProductionOrderChainHandler: handleFault <==");
        return false;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("==> ProductionOrderChainHandler: close <==");

    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println("==> ProductionOrderChainHandler: getHeaders <==");
        return null;
    }
}
