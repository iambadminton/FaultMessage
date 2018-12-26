package com.company.jaxws.handler.cardservice.common;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class CreditCardChainHandler  implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        System.out.println("CreditCardChainHandler: getHeaders()");
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("CreditCardChainHandler: handleMessage()");
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("CreditCardChainHandler: handleFault()");
        return false;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("CreditCardChainHandler: close()");
    }
}
