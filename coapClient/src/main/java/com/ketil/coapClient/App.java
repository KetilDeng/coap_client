package com.ketil.coapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.CoapClient;

public class App 
{
    public static void main( String[] args ) {
		CoapClient client = new CoapClient("134.175.209.166:5684/api");
		try {
			CoapResponse response = client.get();
			// CoapResponse response = client.post("hello",0);
			// CoapResponse response = client.put("hello",0);
			// CoapResponse response = client.delete();
			if(response !=null){
				System.out.println("Code:" + response.getCode());
				System.out.println("Options:" + response.getOptions());
				System.out.println("payload:" + response.getPayload());
				System.out.println("Text:" + response.getResponseText());

			}
		} catch (Exception e) {
			System.out.println("Exception thrown  :" + e);
		} 
    }
}
