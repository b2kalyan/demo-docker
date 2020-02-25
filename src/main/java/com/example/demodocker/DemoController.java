package com.example.demodocker;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController
{
	public static String ROOT_PATH = "/var/ftp/application/pub/";
	
    @RequestMapping("/")    
    public String home()
    {
    	return "Hello! This is a docker demo on openshift";
    }
    
    @RequestMapping("/path")
    public Response getPath() {
    	
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	return new Response(ROOT_PATH + UUID.randomUUID().toString());
    }
}