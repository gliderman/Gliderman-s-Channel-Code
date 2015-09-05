package pack;

public class Project1 {

    int intValue = 6;
    float floatValue = 3.14f;
    boolean booleanValue = true;
    
    public static void main(String[] args) {
        new Project1(4);
    }
    
    public Project1(int a) {
        System.out.println("A parameter: " + a);
        System.out.println("An integer value: " + intValue);
        System.out.println("A float value: " + floatValue);
        System.out.println("A boolean value: " + booleanValue);
    }

}