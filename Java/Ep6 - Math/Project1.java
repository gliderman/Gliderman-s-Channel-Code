package pack;

public class Project1 {

    float aValue = 6;
    
    public static void main(String[] args) {
        new Project1(4);
    }
    
    public Project1(float bValue) {
//      float cValue = aValue / bValue;
        double cValue = Math.pow(aValue, bValue);
        System.out.println("Result: " + cValue);
    }

}