package dao;

import org.apache.log4j.Logger;

public class HelloWorldDao {
	private int id;
	private static final Logger logger = Logger.getLogger(HelloWorldDao.class);
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void save() {
		logger.info("start method save");
	}
	
	public void delete() {
		logger.info("start method delete");
		if (logger.isDebugEnabled()) {
			logger.debug("ID :" +id);
		}
	}
}
