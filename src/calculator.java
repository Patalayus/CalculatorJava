import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculator {
    public static void main(String args[]) throws InterruptedException {
        Scanner scannervariable = new Scanner(System.in);
        System.out.println("Please choose the calculation you want to do:");
        System.out.println("1. Add\n2. Minus\n3. Divide\n4. Multiply\n5. Mod\n6. Quadratic Formula" +
                "\n7. Momentum of an object\n8. Speed of an object\n9. Print prime numbers");
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
        if(userchoice.equals("6")){
            //this section of code will work to give you a negative and positive x using the quadratic formula
            System.out.println("Please enter your A");
            double enps_Axquad = scannervariable.nextDouble();
            System.out.println("Please enter your B");
            double enps_Bxquad = scannervariable.nextDouble();
            System.out.println("Please enter your C");
            double enps_Cxquad =scannervariable.nextDouble();
            //-b+-/b^2-4(a*c)
            //---------------
            //     2a
            double enps_AxC;
            double enps_4xAC;
            double enps_BxB;
            double enps_BB_4xAC;
            double enps_SqrtB_4xAC;
            double enps_top;
            double enps_total;
            double enps_top2;
            double enps_total2;

            enps_AxC = enps_Axquad*enps_Cxquad;
            enps_4xAC = 4*enps_AxC;
            enps_BxB = enps_Bxquad*enps_Bxquad;
            enps_BB_4xAC = enps_BxB - enps_4xAC;
            enps_SqrtB_4xAC = Math.sqrt(enps_BB_4xAC);
            enps_top = -enps_Bxquad+enps_SqrtB_4xAC;
            enps_top2 = -enps_Bxquad-enps_SqrtB_4xAC;
            enps_total = enps_top/2*enps_Axquad;
            enps_total2 = enps_top2/2*enps_Axquad;

            System.out.println("Your positive x is "+enps_total);
            System.out.println("Your negative x is "+enps_total2);
        }
        if(userchoice.equals("7")){
            //this subroutine will assist you in working out the momentum of any object given its mass and velocity.
            System.out.println("Please enter your mass");
            double enps_mass = scannervariable.nextDouble();
            System.out.println("Please enter your velocity");
            double enps_velocity = scannervariable.nextDouble();
            double enps_momentum = enps_mass*enps_velocity;
            System.out.println("Your total is "+enps_momentum);
        }
        if(userchoice.equals("8"))
        {
            //this subroutine will allow for a user to be able to work out the speed of an object
            System.out.println("Please enter your distance in meters");
            double enps_distance = scannervariable.nextDouble();
            System.out.println("Please enter your time in seconds");
            double enps_time = scannervariable.nextDouble();
            double enps_totalspeed = enps_distance / enps_time;
            System.out.println("You total speed is "+enps_totalspeed+"m/s");
        }
        if(userchoice.equals("9")){
            //this subroutine prints prime numbers from 1 to 1000
            System.out.println("Printing prime numbers...");
            int count = 2;
            for(int i=2;i<1000;i++){
                count++;
                if(count%2!=0&&count%3!=0&&count%4!=0&&count%5!=0
                        &&count%6!=0&&count%7!=0&&count%8!=0&&count%9!=0){
                    System.out.println(count+ " is a prime number");
                }
            }
        }
        if (!userchoice.equals("1")&!userchoice.equals("2")&
                !userchoice.equals("3")&!userchoice.equals("4")&
                !userchoice.equals("5")&!userchoice.equals("6")&
                !userchoice.equals("7")&!userchoice.equals("8")&
                !userchoice.equals("9")){
            System.out.println("Please enter a valid input");

        }
    }
}
