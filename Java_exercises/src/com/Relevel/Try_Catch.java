package com.Relevel;

import java.net.MalformedURLException;
import java.net.URL;

public class Try_Catch {
	public static void main(String[] args) {
		try {
			URL url = new URL("www.relevel.com");
			System.out.println(url.getProtocol()+ " - " + url.getHost());
			
		} catch (MalformedURLException e) {
			System.out.println("Error Occured");
		}
	}

}
