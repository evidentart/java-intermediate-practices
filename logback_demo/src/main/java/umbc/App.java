package umbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
    static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.info("Hello World!");
        logger.debug("debug logger");
        logger.trace("Trace logger");
        logger.error("Error logger");
        logger.warn("Warn logger");
    }
}
