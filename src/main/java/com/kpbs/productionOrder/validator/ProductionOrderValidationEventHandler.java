package com.kpbs.productionOrder.validator;

import org.apache.log4j.Logger;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

public class ProductionOrderValidationEventHandler implements ValidationEventHandler {
    public static final Logger LOG =  Logger.getLogger(ProductionOrderValidationEventHandler.class);

    public boolean handleEvent(ValidationEvent event) {

        LOG.debug("ProductionOrderValidationEventHandler ::handleEvent");
        LOG.debug("\nEVENT");
        LOG.debug("SEVERITY:  " + event.getSeverity());
        LOG.debug("MESSAGE:  " + event.getMessage());
        LOG.debug("LINKED EXCEPTION:  " + event.getLinkedException());
        LOG.debug("LOCATOR");
        LOG.debug("    LINE NUMBER:  " + event.getLocator().getLineNumber());
        LOG.debug("    COLUMN NUMBER:  " + event.getLocator().getColumnNumber());
        LOG.debug("    OFFSET:  " + event.getLocator().getOffset());
        LOG.debug("    OBJECT:  " + event.getLocator().getObject());
        LOG.debug("    NODE:  " + event.getLocator().getNode());
        LOG.debug("    URL:  " + event.getLocator().getURL());
        /*--*/
        LOG.debug("" + event.getSeverity());

        return true;
    }

}