package programme_19_cylinder;

/**
 * Write a class with the name Cylinder that extends Circle class. the class needs one filed (instance variable)
 * with name height of type double.
 * the class needs to have one constructor with two parameters radius and height both of type double.
 * It needs to call the parent constructor and initialize a height field.
 * Incase the height parameter is less than 0 it needs to set the height field value to 0
 * Write the following methods(instance methods):
 * Method named getHeight without any parameters, it needs to return the value of height field
 * Method named getVolume without any parameters, it needs to return the calculated volume.
 * to calculate volume, Multiply the area with height.
 */

public class Cylinder extends Circle {


    double height;
    public Cylinder(double radius, double height){
        super(radius);
        if(height<0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
}
