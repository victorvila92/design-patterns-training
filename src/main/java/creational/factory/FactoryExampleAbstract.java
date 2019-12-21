package creational.factory;

public abstract class FactoryExampleAbstract {

    protected double attribute1;
    abstract void getAttribute();

    public void calculate(int x){
        System.out.println(x * attribute1);
    }
}
