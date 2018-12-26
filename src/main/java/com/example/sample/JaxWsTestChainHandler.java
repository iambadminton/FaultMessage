package com.example.sample;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;

public class JaxWsTestChainHandler implements SOAPHandler<SOAPMessageContext> {
    private static Logger LOG = Logger.getLogger(JaxWsTestChainHandler.class);

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println(" ===> JaxWs handleMessage <===");
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outbound) {
            // Include your steps for the outbound flow.
        }

        dumpSOAPMessage(context.getMessage());
        return true;

    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println(" ===> JaxWs handleFault <===");
        return false;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println(" ===> JaxWs close <===");

    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println(" ===> JaxWs getHeaders <===");
        return null;
    }

    private void dumpSOAPMessage(SOAPMessage msg) {
        LOG.debug("KPBSServiceChainHandler::dumpSOAPMessage");
        if (msg == null) {
            LOG.debug("SOAP Message is null");
            return;
        }

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            msg.writeTo(baos);
            LOG.debug(baos.toString(getMessageEncoding(msg)));

            // show included values
            String values = msg.getSOAPBody().getTextContent();
            LOG.debug("Included values:" + values);
        } catch (Exception e) {
            LOG.debug("dumpSOAPMessage exception: " + e.getMessage());
        }
    }


    private String getMessageEncoding(SOAPMessage msg) throws SOAPException {
        String encoding = "utf-8";
        if (msg.getProperty(SOAPMessage.CHARACTER_SET_ENCODING) != null) {
            encoding = msg.getProperty(SOAPMessage.CHARACTER_SET_ENCODING).toString();
        }
        return encoding;

    }

}
