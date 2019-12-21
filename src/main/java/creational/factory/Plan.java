package creational.factory;

import utils.LoggerSingleton;

import java.util.logging.Logger;

abstract class Plan{

    protected double rate;
    abstract void getRate();
    private static Logger logger = LoggerSingleton.getInstance();

    public void calculateBill(int units){
        logger.info(String.valueOf(units*rate));
    }
}//end of Plan class.