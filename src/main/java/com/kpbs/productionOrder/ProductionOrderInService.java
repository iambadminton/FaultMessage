package com.kpbs.productionOrder;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-21T16:49:36.039+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "ProductionOrder_InService",
                  wsdlLocation = "file:src/main/webapp/WEB-INF/wsdl/ProductionOrder_In.wsdl",
                  targetNamespace = "http://esb.z-t-z.ru/Integration/SAP")
public class ProductionOrderInService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://esb.z-t-z.ru/Integration/SAP", "ProductionOrder_InService");
    public final static QName ProductionOrderIn = new QName("http://esb.z-t-z.ru/Integration/SAP", "ProductionOrder_In");
    static {
        URL url = null;
        try {
            url = new URL("file:src/main/webapp/WEB-INF/wsdl/ProductionOrder_In.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProductionOrderInService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:src/main/webapp/WEB-INF/wsdl/ProductionOrder_In.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProductionOrderInService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProductionOrderInService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductionOrderInService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns ProductionOrderIn
     */
    @WebEndpoint(name = "ProductionOrder_In")
    public ProductionOrderIn getProductionOrderIn() {
        return super.getPort(ProductionOrderIn, ProductionOrderIn.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductionOrderIn
     */
    @WebEndpoint(name = "ProductionOrder_In")
    public ProductionOrderIn getProductionOrderIn(WebServiceFeature... features) {
        return super.getPort(ProductionOrderIn, ProductionOrderIn.class, features);
    }

}
