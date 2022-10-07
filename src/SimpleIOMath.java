import java.util.Scanner;

/**
 * @version 9/27/22
 * @author me
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * prompt user  for input
     */
    public  void promptUser()    {
        Scanner in= new Scanner(System.in);
        System.out.println("Sit yourself down, take a seat");
        System.out.println("All you gotta do is repeat after me");
        System.out.print("Enter your name: " );
        name= in.nextLine();
        System.out.print("Enter your age: " );
        age= in.nextInt();
        System.out.print("Enter your favorite number: " );
        favNumber= in.nextInt();
    }

    /**
     *  method for printing user input
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name );
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age +1) + ".");
        System.out.println("The first prime factor of " + age + " is: "+ smallestPrimeFactor(age) +".");
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: "+ (favNumber*favNumber));
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num) {
        for (int i = 2; i<(int)(Math.sqrt(num)+1); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i=2; i < Math.sqrt(num)+1; i++) {
            if (isPrime(i)) {
                if (num % i == 0)
                    return i;
            }
        }
        return num;
    }


    /**
     * main method for java class
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args)  {
        SimpleIOMath app = new SimpleIOMath();
        //System.out.println("Sit yourself down, take a seat");
        //        System.out.println("All you gotta do is repeat after me");
        app.promptUser();
        app.printInfo();
    }
}
