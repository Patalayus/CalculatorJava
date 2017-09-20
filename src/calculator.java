import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculator {
    public static void main(String args[]) throws InterruptedException {
        Scanner scannervariable = new Scanner(System.in);
        //CALCULATOR APPLICATION IN JAVA
        System.out.println("Please choose the calculation you want to do:");
        System.out.println("1. Add\n2. Minus\n3. Divide\n4. Multiply\n5. Mod\n6. Quadratic Formula" +
                "\n7. Momentum of an object\n8. Speed, distance or time of an object\n9. Print prime numbers\n10. Young's Modulus" +
                "\n11. Work out voltage of a circuit\n12. Print even numbers to 100\n13. Print odd numbers to 100" +
                "\n14. Work out the kinetic energy of an object\n15. work out the period of an object" +
                "\n16. Work out density\n17. work out the refractive index of an object" +
                "\n18. SUVAT\n19. Calculate change in gravitational potential energy\n20. Work out the force on an object");
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
            System.out.println("Please specify which equation you want to use:\n1.S=D/T\n2.T=D/S\n3.D=SxT");
            double responce = scannervariable.nextDouble();
            if(responce == 1){
                //S=D/T
                System.out.println("Please enter your distance");
                double distance0 = scannervariable.nextDouble();
                System.out.println("Please enter you time");
                double time0 = scannervariable.nextDouble();
                double total0 = distance0 / time0;
                System.out.println("Your total is"+total0);
            }else if(responce ==2){
                //T=D/S
                System.out.println("Please enter your distance");
                double distance1 = scannervariable.nextDouble();
                System.out.println("Please enter your speed");
                double speed1 = scannervariable.nextDouble();
                double total1 = distance1 / speed1;
                System.out.println("Your total is"+total1);
            }else if(responce ==3){
                //D=SxT
                System.out.println("Please enter your speed");
                double speed0 = scannervariable.nextDouble();
                System.out.println("Please enter your time");
                double time1 = scannervariable.nextDouble();
                double total2 = speed0 / time1;
                System.out.println("Your total is"+total2);
            }else{
                System.out.println("Please enter a valid input");
            }
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
        if(userchoice.equals("10")){
            System.out.println("You have chosen to work out the Young's Modulus of an object");
            //E = (F/A)/(DeltaL/L)
            System.out.println("Please enter your force");
            double enps_forceforyoungs = scannervariable.nextDouble();
            System.out.println("Please enter your area");
            double enps_areaforyoungs = scannervariable.nextDouble();
            System.out.println("Please enter your change in length");
            double enps_changeinlengthforyoungs = scannervariable.nextDouble();
            System.out.println("Please enter your original length");
            double enps_originallength = scannervariable.nextDouble();
            double youngs = (enps_forceforyoungs/enps_areaforyoungs)/(enps_changeinlengthforyoungs/enps_originallength);
            System.out.println("Your Young's Modulus is "+youngs);
        }
        if(userchoice.equals("11")){
            System.out.println("Please enter your current in amps");
            double enps_currentvariable = scannervariable.nextDouble();
            System.out.println("Please enter your resistance in ohms");
            double enps_resistancevariable = scannervariable.nextDouble();
            double enps_voltage = enps_currentvariable * enps_resistancevariable;
            System.out.println("You voltage is "+enps_voltage+"v");
        }
        if(userchoice.equals("12")){
            for(int content=0;content<100;content++){
                if(content%2==0){
                    System.out.println(content);
                }
            }
        }
        if(userchoice.equals("13")){
            for(int odd = 0;odd<100;odd++){
                if(odd%2!=0){
                    System.out.println(odd);
                }
            }
        }
        if(userchoice.equals("14")){
            System.out.println("Please enter your mass in kilograms");
            double enps_Xmass = scannervariable.nextDouble();
            System.out.println("Please enter your speed in m/s");
            double enps_Xspeed = scannervariable.nextDouble();
            double enps_kineticenergy = (0.5*enps_Xmass)*(enps_Xspeed*enps_Xspeed);
            System.out.println("Your total kinetic energy is "+enps_kineticenergy+"J");
        }
        if(userchoice.equals("15")){
            System.out.println("Please enter your frequency");
            double enps_frequency = scannervariable.nextDouble();
            //T=1/f
            double enps_total1212 = 1/enps_frequency;
            System.out.println(enps_total1212);
        }
        if(userchoice.equals("16")){
            System.out.println("Please enter your mass");
            double enps_mass11 = scannervariable.nextDouble();
            System.out.println("Please enter volume");
            double enps_volume11 = scannervariable.nextDouble();
            double enps_density = enps_mass11 / enps_volume11;
            System.out.println("Your total is "+enps_density);
        }
        if(userchoice.equals("17")){
            System.out.println("Please enter your angle of incidence");
            double enps_AOI = scannervariable.nextDouble();
            System.out.println("Please enter your angle of refraction");
            double enps_AOR = scannervariable.nextDouble();
            double enps_totalRef = Math.sin(enps_AOI)/Math.sin(enps_AOR);
            System.out.println("Your total is"+enps_totalRef);
        }
        if(userchoice.equals("18")){
            System.out.println("You have chosen to do a SUVAT equation\nPlease choose one:\n1. v=u+at\n2. s=ut+0.5*at^2\n3." +
                    " s=0.5(u+v)t\n4. v^2=u^2+2as\n5. s=vt-0.5at^2");
            double responce = scannervariable.nextDouble();
            if(responce == 1){
                //v=u+at
                System.out.println("Please enter your initial velocity");
                double enps_U = scannervariable.nextDouble();
                System.out.println("Please enter your area");
                double enps_A = scannervariable.nextDouble();
                System.out.println("Please enter your time");
                double enps_T = scannervariable.nextDouble();
                double enps_TotalSUVAT1 = enps_U*(enps_A*enps_T);
                System.out.println("Your total is "+enps_TotalSUVAT1);
            }else if(responce == 2){
                //s=ut+0.5*at^2
                System.out.println("Please enter your initial velocity");
                double enps_U2 = scannervariable.nextDouble();
                System.out.println("Please enter your time");
                double enps_T2 = scannervariable.nextDouble();
                System.out.println("Please enter your area");
                double enps_A2 = scannervariable.nextDouble();
                double enps_ATSquared = (enps_A2*enps_T2)*(enps_A2*enps_T2);
                double total_SUVAT2 = enps_U2*enps_T2+0.5*enps_ATSquared;
                System.out.println("Your total is "+total_SUVAT2);
            }else if(responce == 3){
                //s=0.5(u+v)t
                System.out.println("Please enter your initial velocity");
                double enps_U3 = scannervariable.nextDouble();
                System.out.println("Please enter your final velocity");
                double ens_V2 = scannervariable.nextDouble();
                System.out.println("Please enter your time");
                double enps_T3 = scannervariable.nextDouble();
                double total_3 = 0.5*(enps_U3+ens_V2)*enps_T3;
                System.out.println("Your total is "+total_3);
            }else if(responce == 4){
                //v^2=u^2+2as
                System.out.println("Please enter your initial velocity");
                double enps_U4 = scannervariable.nextDouble();
                System.out.println("Please enter your area");
                double enps_A3 = scannervariable.nextDouble();
                System.out.println("Please enter your distance");
                double enps_D = scannervariable.nextDouble();
            }else if(responce == 5){
                //s=vt-0.5at^2
                System.out.println("Please enter your final velocity");
                double enps_V = scannervariable.nextDouble();
                System.out.println("Please enter your time");
                double enps_T4 = scannervariable.nextDouble();
                System.out.println("Please enter your initial velocity");
                double enps_U5 = scannervariable.nextDouble();
            }
        }if(userchoice.equals("19")){
            //Ep=m*g*h
            System.out.println("You have chosen to work out the change in gravitational energy of an object.");
            System.out.println("Please enter your mass");
            double mass = scannervariable.nextDouble();
            System.out.println("Please enter your gravitational field strength");
            double field_strength = scannervariable.nextDouble();
            System.out.println("Please enter you height");
            double height = scannervariable.nextDouble();
            double total_all = mass*field_strength*height;
            System.out.println("Your total is "+total_all);
        }
        if(userchoice.equals("20")){
            //F=m*a
            System.out.println("You have chosen to work out the force on an object.\nPlease enter your mass. (kg)");
            double enps_mass_ = scannervariable.nextDouble();
            System.out.println("Please enter your acceleration (m/s^2)");
            double enps_accceleration_ = scannervariable.nextDouble();
            double enps_total_ = enps_mass_ * enps_accceleration_;
            System.out.println("Your total is "+enps_total_+"N");
        }
        if (!userchoice.equals("1")&!userchoice.equals("2")&
                !userchoice.equals("3")&!userchoice.equals("4")&
                !userchoice.equals("5")&!userchoice.equals("6")&
                !userchoice.equals("7")&!userchoice.equals("8")&
                !userchoice.equals("9")&!userchoice.equals("10")
                &!userchoice.equals("11")&!userchoice.equals("12")
                &!userchoice.equals("13")&!userchoice.equals("14")
                &!userchoice.equals("15")&!userchoice.equals("16")
                &!(userchoice.equals("17")&!(userchoice.equals("18")&!
                (userchoice.equals("19"))))){
            System.out.println("Please enter a valid input");
        }
    }
}
