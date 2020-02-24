package com.example.demodocker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController
{
	public static String ROOT_PATH = "/var/ftp/application/pub/";
	
    @RequestMapping("/")
    public List<Customer> findAll()
    {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "frank"));
        customerList.add(new Customer(2, "john"));
        return customerList;
    }
    
    @RequestMapping("/path")
    public Response getPath() {
    	
    	try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	return new Response(ROOT_PATH + UUID.randomUUID().toString());
    }
    
    @RequestMapping("/healthz")
    public String getHealth() {
    	return "Ok";
    }
}