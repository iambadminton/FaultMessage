package com.kpbs.productionOrder.validator;

import org.apache.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ProductionOrderErrorHandler implements ErrorHandler {
public  static final Logger LOG = Logger.getLogger(ProductionOrderErrorHandler.class);

    private  boolean isValid = true;
    public boolean isValid() {
        return this.isValid;
    }

    public void warning(SAXParseException exception)  {
        LOG.debug("ObjectFactory::constructor");

        LOG.error(exception);

    }

    public void error(SAXParseException exception) throws SAXException {
        LOG.debug("ProductionOrderErrorHandler: error");
        this.isValid = false;
        LOG.error(exception.getMessage());
        throw exception;

    }

    public void fatalError(SAXParseException exception) throws SAXException {
        LOG.debug("ProductionOrderErrorHandler: error");
        this.isValid = false;
        LOG.error(exception.getMessage());


    }




}
