
package com.helloworldcxf;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-28T13:20:25.980+03:00
 * Generated source version: 3.2.7
 *
 */

public class Greeter_SoapPort_Server{

    protected Greeter_SoapPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SoapPortImpl();
        String address = "http://localhost:9000/SoapContext/SoapPort";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new Greeter_SoapPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}