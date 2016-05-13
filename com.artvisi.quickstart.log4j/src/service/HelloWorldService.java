package service;

import org.apache.log4j.Logger;

import dao.HelloWorldDao;

public class HelloWorldService {
	private static final Logger logger = Logger.getLogger(HelloWorldService.class);
	private HelloWorldDao helloWorldDao;
	
	public HelloWorldDao getHelloWorldDao() {
		return helloWorldDao;
	}
	public void setHelloWorldDao(HelloWorldDao helloWorldDao) {
		this.helloWorldDao = helloWorldDao;
	}
	
	public void deleteTHrowId(Integer id)
}
