package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class DataRunner implements CommandLineRunner {

	
	@Override
	public String toString() {
		return "DataRunner [appName=" + appName + ", dbDriver=" + dbDriver + ", dbUrl=" + dbUrl + ", emailPort="
				+ emailPort + ", emailHost=" + emailHost + "]";
	}


	@Value("${my.appname}")
	private  String appName;
	
	@Value("${my.db.driver}")
	private  String dbDriver;
	@Value("${my.db.url}")
	private String dbUrl;
	@Value("${my.email.port}")
	private  String emailPort;
	@Value("${my.email.host}")
	private String emailHost;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
