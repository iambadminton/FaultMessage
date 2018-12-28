package com.helloworldcxf;

import org.apache.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;

public class GreetMeChainHandler implements SOAPHandler<SOAPMessageContext> {
    private static Logger LOG = Logger.getLogger(GreetMeChainHandler.class);

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println(" ===> helloworldcxf handleMessage <===");
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outbound) {
            // Include your steps for the outbound flow.
        }
        /*try {
            SOAPMessage message = context.getMessage();
            SOAPHeader header = message.getSOAPHeader();
            String contentType = header.getAttribute("Content-type");
            LOG.debug("SOAPHeader: Content-type=" + contentType);
            System.out.println("SOAPHeader: Content-type=" + contentType);
        } catch (SOAPException e) {
            e.printStackTrace();
        }*/
        dumpSOAPMessage(context.getMessage());
        return true;

    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println(" ===> helloworldcxf handleFault <===");
        return false;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println(" ===> helloworldcxf close <===");

    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println(" ===> helloworldcxf getHeaders <===");
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
