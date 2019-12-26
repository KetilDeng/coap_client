package com.ketil.coapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import java.net.URI;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) {
		URI uri = null;
		try{
			uri = new URI("localhost:5683");
			CoapClient client = new CoapClient(uri);
			try {
				CoapResponse response = client.get();
				// CoapResponse response = client.post("hello",0);
				// CoapResponse response = client.put("hello",0);
				// CoapResponse response = client.delete();
				if(response !=null){
					System.out.println("Code:" + response.getCode());
					System.out.println("Options:" + response.getOptions());
					System.out.println("Text:" + response.getResponseText());
				}
			} catch (Exception e) {
				System.out.println("Exception thrown  :" + e);
			} 
		}catch(Exception e){
			System.out.println("Exception thrown  :" + e);
		}
    }
}
