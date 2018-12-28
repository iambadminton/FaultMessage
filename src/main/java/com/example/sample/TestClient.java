package com.example.sample;

import com.example.sample.TestJaxWs;
import com.example.sample.TestJaxWsService;
import com.example.sample.UserDefinedException;

public class TestClient {
    public static void main( String[] args ) {
        try {
            TestJaxWsService service = new TestJaxWsService();
            TestJaxWs port = service.getTestJaxWs();
            /*JaxWsTest1 jaxWsTest1 = new JaxWsTest1();
            jaxWsTest1.setInformation("information");
            jaxWsTest1.setCount(4);*/

            String returnValue = port.jaxWsTest1( "Invocation test.", 1003 );
            //String returnValue = port.jaxWsTest1(jaxWsTest1);

            System.out.println( "[RESULT] " + returnValue );
        }
        catch( UserDefinedException e ){
            e.printStackTrace();
        }
    }

}
