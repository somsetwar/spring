package com.cts.training.boot.userproperties.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myapp")
public class MyProperties {
	public static class Server{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	public  static class Ip{
		private String address;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
	}
	
	
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	private Server server=new Server();
	private Ip ip=new Ip();

	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	public Ip getIp() {
		return ip;
	}
	public void setIp(Ip ip) {
		this.ip = ip;
	}
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	


}
