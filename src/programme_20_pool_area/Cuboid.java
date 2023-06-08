package programme_20_pool_area;

/**
 * Write a class with the name Cuboid that extends Rectangle class. the class needs one field (instance varibale)
 * with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type double.
 * It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods(instance methods):
 * Method named getHeight without any parameters, it needs to return the value of height field
 * Method named getVolume without any parameters, it needs to return the calculated volume.
 * to calculate volume, multiply the area with height.
 */

public class Cuboid extends Rectangle {

    double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = height;
        if (this.height<0){
            this.height = 0;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return (getArea()*getHeight());
    }
}
