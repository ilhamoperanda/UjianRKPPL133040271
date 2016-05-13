package com.artvisi.quickstart.log4j;

import org.apache.log4j.Logger;

import dao.HelloWorldDao;
import service.HelloWorldService;

public class Main {
	private static final Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		logger.info("inisial dao");
		
		HelloWorldDao dao = new HelloWorldDao();
		
		logger.info("inisial service");
		
		
	}
}
