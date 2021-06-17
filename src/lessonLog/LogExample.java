package lessonLog;

import org.apache.log4j.Logger;

public class LogExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LogExample.class");
        logger.info("Information");
        logger.debug("Debug info");
        logger.error("Error info");
    }
}
