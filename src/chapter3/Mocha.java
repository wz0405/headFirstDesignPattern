package chapter3;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", 모카";

    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
}
