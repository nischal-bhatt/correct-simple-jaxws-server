package main;


import javax.xml.ws.*;
import ws.*;
public class Main {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:4789/ws/demo", new DemoImpl());
			System.out.println("done");
		}catch (Exception e)
		{
			
		}

	}

}
