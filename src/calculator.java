import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner scannervariable = new Scanner(System.in);
        System.out.println("Please choose the calculation you want to do:");
        System.out.println("1. Add\n2. Minus\n3. Divide\n4. Multiply\n5. Mod");
        String userchoice = scannervariable.nextLine();
        if (userchoice.equals("1")) {
            //this section of code works to allow for the user to add two numbers together
            System.out.println("Enter your first number");
            double first = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double second = scannervariable.nextDouble();
            double total = first + second;
            System.out.println("Your total is " + total);
        }
        if (userchoice.equals("2")){
            //this section of code works to allow for the user to minus two numbers together
            System.out.println("Enter your first number");
            double enps_first = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double enps_second = scannervariable.nextDouble();
            double enps_total = enps_first - enps_second;
            System.out.println("Your total is "+enps_total);
        }
        if (userchoice.equals("3")){
            //this section of code works to allow for the user to be able to divide two number together
            System.out.println("Enter your first number");
            double enps_first2 = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double enps_second2 = scannervariable.nextDouble();
            double enps_total2 = enps_first2 / enps_second2;
            System.out.println("Your total is "+enps_total2);
        }
        if (userchoice.equals("4")){
            //this section of code works to allow for the user to be able to multiply two numbers together
            System.out.println("Enter your first number");
            double enps_first3 = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double enps_second3 = scannervariable.nextDouble();
            double enps_total3 = enps_first3 * enps_second3;
            System.out.println("Your total is "+enps_total3);
        }
        if(userchoice.equals("5"))
        {
            //this section of code works to allow for the user to be able to divide two numbers together for the remainder
            System.out.println("Enter your first number");
            double enps_answer1 = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double enps_answer2 = scannervariable.nextDouble();
            double enps_total22 = enps_answer1 % enps_answer2;
            System.out.println("Your total is "+enps_total22);
        }
        if ((userchoice!="1")&&(userchoice!="2")&&(userchoice!="3")&&(userchoice!="4")){
            System.out.println("Please enter a valid input");
        }
    }
    //by Laminar Softworks
    //Please leave feedback
}
