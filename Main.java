import java.util.Scanner; //we start by importing the Scanner from the java util package.

class Main { // main class
  public static void main(String[] args) { // main method
    Scanner sc = new Scanner(System.in); //here we initialize our scanner object using the new operator

    System.out.println("Hello please tell me your name?"); //regular print statement
    String name = sc.nextLine(); // here we are accepting a string that's input into the console, and assigning it as a value to our variable
    System.out.println("Hello " + name + ", it is nice to meet you."); //once the input is entered, this print statement executes; printing our input with a string.

    System.out.println("What state do you live in?");
    String state = sc.nextLine();

    System.out.println("How old are you?");
    int age = sc.nextInt(); // here we are accepting an integer that's input into the console, and assigning it as a value to our variable

    System.out.println(name + ", I am also " + age + " and hear that " + state + " is beautiful!");
    
    sc.close(); //Once we're done using our scanner, we use this to close it.
  }
}