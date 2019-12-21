package creational.singleton;

import utils.LoggerSingleton;

import java.util.logging.Logger;

public class SingletonExampleMain {

    private static SingletonExample singletonExample = SingletonExample.getInstance();
    private static Logger logger = LoggerSingleton.getInstance();

    public static void main (String[] args) {

        if (singletonExample != null) {
            logger.info("SINGLETON OK");
        } else {
            logger.warning("SINGLETON ERROR");
        }

        /*
          NOT ALLOWED
         */
        // SingletonExample example2 = new SingletonExample();
    }
}