package utils;

import java.util.logging.Logger;

public class LoggerSingleton {
    private static Logger logger;

    private LoggerSingleton(){}

    public static Logger getInstance() {
        if (logger == null) {
            logger = Logger.getLogger("MainLogger");
        }
        return logger;
    }
}
