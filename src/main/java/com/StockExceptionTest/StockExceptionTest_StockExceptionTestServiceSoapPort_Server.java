
package com.StockExceptionTest;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-21T12:29:19.531+03:00
 * Generated source version: 3.2.7
 *
 */

public class StockExceptionTest_StockExceptionTestServiceSoapPort_Server{

    protected StockExceptionTest_StockExceptionTestServiceSoapPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new StockExceptionTestServiceSoapPortImpl();
        String address = "http://localhost:8080/StockExceptionTestService/services/StockExceptionTestService";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new StockExceptionTest_StockExceptionTestServiceSoapPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}