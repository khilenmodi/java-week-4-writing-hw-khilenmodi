package programme_17_carpet_cost_calculator;

/**
 * Write a class with the name calculator. The class needs two fields(instance variable)
 * with name floor of type
 * floor and carpet of type carpet.
 * The class need to have one constructor with parameters floor of type floor and carpet of
 * type carpet and it needs to initialize the field
 * Write the following methods(instance methods):
 * Method name getTotalCost without any parameters, it need to return the calculated total cost to cover
 * The floor with a carpet.
 */

public class Calculator {

    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}
