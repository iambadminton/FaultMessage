package com.example.sample;

import com.example.sample.TestJaxWs;
import com.example.sample.TestJaxWsService;
import com.example.sample.UserDefinedException;

public class TestClient {
    public static void main( String[] args ) {
        try {
            TestJaxWsService service = new TestJaxWsService();
            TestJaxWs port = service.getTestJaxWs();

            String returnValue = port.jaxWsTest1( "Invocation test.", 1003 );

            System.out.println( "[RESULT] " + returnValue );
        }
        catch( UserDefinedException e ){
            e.printStackTrace();
        }
    }

}
