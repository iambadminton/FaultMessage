package com.helloworldcxf;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-28T13:20:25.967+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://apache.org/hello_world_soap_http", name = "Greeter")
@XmlSeeAlso({ObjectFactory.class})
public interface Greeter {

    @WebMethod
    @RequestWrapper(localName = "pingMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.PingMe")
    @ResponseWrapper(localName = "pingMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.PingMeResponse")
    public void pingMe() throws PingMeFault;

    @WebMethod
    @RequestWrapper(localName = "greetMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.GreetMe")
    @ResponseWrapper(localName = "greetMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.GreetMeResponse")
    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
    public java.lang.String greetMe(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String requestType
    ) throws PingMeFault;

    @WebMethod
    @Oneway
    @RequestWrapper(localName = "greetMeOneWay", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.GreetMeOneWay")
    public void greetMeOneWay(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String requestType
    );

    @WebMethod
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "com.helloworldcxf.SayHiResponse")
    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
    public java.lang.String sayHi();
}