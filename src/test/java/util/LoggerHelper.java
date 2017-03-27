package util;

import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class LoggerHelper {
    private static Logger logger = Logger.getLogger(ClassName.class.getName());

    private LoggerHelper() {

    }

    public static void navigating(String name, Runnable function) {
            logger.info("Navigating " + name);
            function.run();
            logger.info("Navigated " + name);
    }

    public static void searching(String name, Runnable function) {
            logger.info("Searching " + name);
            function.run();
            logger.info("Searched " + name);
    }

    public static void asserting(String name, Runnable function) {
            logger.info("Asserting " + name);
            function.run();
            logger.info("Asserted " + name);
        }

    public static void clicking(String name, Runnable function) {
            logger.info("Clicking on" + name);
            function.run();
            logger.info("Clicked " + name);
    }
}
