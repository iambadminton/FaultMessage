package com.company.jaxws.handler.cardservice.common;

import com.kpbs.AppContext;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-25T15:20:25.810+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "CardService",
                  //wsdlLocation = "file:src/main/webapp/WEB-INF/wsdl/CreditCardService.wsdl",
                  targetNamespace = "http://cardservice.handler.jaxws.company.com/service")
public class CardService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cardservice.handler.jaxws.company.com/service", "CardService");
    public final static QName CardServicePort = new QName("http://cardservice.handler.jaxws.company.com/service", "CardServicePort");
    static {
        URL url = null;
        try {
            //url = new URL("file:src/main/webapp/WEB-INF/wsdl/CreditCardService.wsdl");
            url = new URL(AppContext.getProperty("cardservice.wsdl.location"));

        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CardService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:src/main/webapp/WEB-INF/wsdl/CreditCardService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CardService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns CardServicePortType
     */
    @WebEndpoint(name = "CardServicePort")
    public CardServicePortType getCardServicePort() {
        return super.getPort(CardServicePort, CardServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardServicePortType
     */
    @WebEndpoint(name = "CardServicePort")
    public CardServicePortType getCardServicePort(WebServiceFeature... features) {
        return super.getPort(CardServicePort, CardServicePortType.class, features);
    }

}
