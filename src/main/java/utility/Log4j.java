package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	public Logger logger() {
		Logger log = LogManager.getLogger(Log4j.class);
		
		return log;
	}
	
}
