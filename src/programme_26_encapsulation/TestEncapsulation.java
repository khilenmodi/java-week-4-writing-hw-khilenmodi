package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // setting value of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        // Displaying values of the variables
        System.out.println("Prime's name :" +obj.getName());
        System.out.println("Prime's age : " + obj.getAge());
        System.out.println("Prime's rollNo :" + obj.getRollNo());
        // direct access of rollNo is not possible due to encapsulation
       //  System.out.println("Prime's rollNo :" + obj.geekName);
    }
}
