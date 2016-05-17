package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld2 {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld2.class);
		logger.debug("这是第二个helloworld的debug测试记录!");
		logger.info("这是第二个helloworld的info测试记录!");
	}
}
