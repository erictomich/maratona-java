
public class JavaFour {
    

    /* 
    Primitive types are the most basic data types available within the Java language.
    There are 8: boolean, byte, char, short, int, long, float and double. 
    These types serve as the building blocks of data manipulation in Java. 
    Such types serve only one purpose — containing pure, simple values of a kind. 
    Because these data types are defined into the Java type system by default,
    they come with a number of operations predefined. 
    You can not define a new operation for such primitive types. 

    https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
    */
    // primitive types: 
    // int, double, float, char, byte, short, long, boolean

    public static void main(String[] args) {

        // primitive types 
        // By default, they are written with a lowercase first letter.
        int myAge = 36;
        long longNumber = 100000L;
        double mySalaryDouble = 5600.0D;
        float mySalaryFloat = 5600.0F;
        byte myAgeByte = 127;
        short myAgeShort = 36;
        boolean isMan = true;
        boolean isWoman = false;
        char caractere = '\u0041'; // padrão para utilizar tabela unicode - para usar tabela asc, não precisa de aspas -- aspas devem ser simples 
        
        // String is not a primitive type 
        // It must be written with the first letter capitalized 
        // For String, use double quotes. 
        String myName = "Eric Tomich Januzzi";

        System.out.println("My age is " + myAge + " years old.");
        System.out.println(myName);

    }
    
    public void execise() {
        String name;
        String address; 
        Float salary; 
        String dateSalary;
    }
}