package nonePrimitiveDataType;


public class PrintHelloWorld {
    public static void main(String[] args) {

        int age=19;
        if (age<2) {
            System.out.println("infant");
        }else if(age<10){
            System.out.println("child");

        }else if(age<20){
            System.out.print("teenage");
        }else if(age<30) {
            System.out.println("adult");
        }else{
            System.out.println("old");
        }
        }
    }