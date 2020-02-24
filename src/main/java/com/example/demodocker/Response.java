package com.example.demodocker;

public class Response {

	public String path;
	
	public Response() {
		
	}
	
	public Response(String path) {
		this();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
