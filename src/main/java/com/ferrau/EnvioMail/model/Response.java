package com.ferrau.EnvioMail.model;

public class Response {
	private int code;
	private String message;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int i) {
		this.code = i;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Response(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public Response() {
		super();
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + "]";
	}
	
	
	
	
	
}
