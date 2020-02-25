package com.example.demodocker;

import java.io.File;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	public static String ROOT_PATH = "/var/ftp/application/pub/";

	@RequestMapping("/")
	public String home() {
		return "Hello! This is a docker demo on openshift";
	}

	@RequestMapping("/path")
    public Response getPath() {
    	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}    		
    	
    	for (int i=0; i<10000; i++) {
    		File f = new File("input-" + UUID.randomUUID().toString() + ".txt");

    	}
    	
    	
    	
    	return new Response(ROOT_PATH + UUID.randomUUID().toString());
    }
}