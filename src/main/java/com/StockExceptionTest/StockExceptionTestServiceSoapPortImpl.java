
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.StockExceptionTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-21T12:29:19.500+03:00
 * Generated source version: 3.2.7
 *
 */

@javax.jws.WebService(
                      serviceName = "StockExceptionTestService",
                      portName = "StockExceptionTestServiceSoapPort",
                      targetNamespace = "http://scatesttool.stockexceptiontestservice",
                      wsdlLocation = "file:src/main/webapp/WEB-INF/wsdl/StockExceptionTest.wsdl",
                      endpointInterface = "com.StockExceptionTest.StockExceptionTest")

public class StockExceptionTestServiceSoapPortImpl implements StockExceptionTest {

    private static final Logger LOG = Logger.getLogger(StockExceptionTestServiceSoapPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.StockExceptionTest.StockExceptionTest#stockQuoteOffer(com.StockExceptionTest.StockOffer input)*
     */
    public com.StockExceptionTest.StockOffer stockQuoteOffer(com.StockExceptionTest.StockOffer input) throws InvalidSymbolFault_Exception,  MarketClosedFault_Exception   {
        LOG.info("Executing operation stockQuoteOffer");
        System.out.println(input);
        try {
            com.StockExceptionTest.StockOffer _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new InvalidSymbolFault_Exception("InvalidSymbolFault...");
        //throw new MarketClosedFault_Exception("MarketClosedFault...");
    }

}