import java.util.Scanner;

public class calculator {
    static double variable2 = 0;
    public static void main(String args[]) throws InterruptedException {
        Scanner scannervariable = new Scanner(System.in);
        validation ValObject = new validation();
        System.out.println("Please choose the calculation you want to do:");
        System.out.println("1. Add\n2. Minus\n3. Divide\n4. Multiply\n5. Mod\n6. Quadratic Formula" +
                "\n7. Momentum of an object\n8. Speed, distance or time of an object\n9. Print prime numbers\n10. Young's Modulus" +
                "\n11. Work out voltage of a circuit\n12. Print even numbers to 100\n13. Print odd numbers to 100" +
                "\n14. Work out the kinetic energy of an object\n15. work out the period of an object" +
                "\n16. Work out density\n17. work out the refractive index of an object" +
                "\n18. SUVAT\n19. Calculate change in gravitational potential energy\n20. Work out the force on an object\n" +
                "21. SOH CAH TOA\n22. Work out the weight of an object\n23. Work out force on an object");
        String userchoice = scannervariable.nextLine();
        if (userchoice.equals("1")) {
            //this section of code works to allow for the user to add two numbers together
            System.out.println("Enter your first number");
                double first = scannervariable.nextDouble();
            System.out.println("Enter your second number");
                double second = scannervariable.nextDouble();
            ValObject.Add(first, second);
            System.out.printf(ValObject.outadd());
        }
        if (userchoice.equals("2")){
            //this section of code works to allow for the user to minus two numbers together
            System.out.println("Enter your first number");
                double enps_first = scannervariable.nextDouble();
            System.out.println("Enter your second number");
                double enps_second = scannervariable.nextDouble();
            ValObject.subtract(enps_first, enps_second);
            System.out.printf(ValObject.subfin());
        }
        if (userchoice.equals("3")){
            //this section of code works to allow for the user to be able to divide two number together
            System.out.println("Enter your first number");
            double enps_first2 = scannervariable.nextDouble();
            System.out.println("Enter your second number");
            double enps_second2 = scannervariable.nextDouble();
            ValObject.div(enps_first2, enps_second2);
            System.out.printf(ValObject.outdiv());
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
            ValObject.modnum(enps_answer1, enps_answer2);
        }
        if(userchoice.equals("6")){
            //this section of code will work to give you a negative and positive x using the quadratic formula
            System.out.println("Please enter your A");
            double enps_Axquad = scannervariable.nextDouble();
            System.out.println("Please enter your B");
            double enps_Bxquad = scannervariable.nextDouble();
            System.out.println("Please enter your C");
            double enps_Cxquad =scannervariable.nextDouble();
            ValObject.Quadratic(enps_Axquad,enps_Bxquad,enps_Cxquad);
            System.out.println(ValObject.output());
        }
        if(userchoice.equals("7")){
            //this subroutine will assist you in working out the momentum of any object given its mass and velocity.
            System.out.println("Please enter your mass (kg)");
            double enps_mass = scannervariable.nextDouble();
            System.out.println("Please enter your velocity (m/s)");
            double enps_velocity = scannervariable.nextDouble();
            ValObject.Momentum(enps_mass, enps_velocity);
            System.out.printf(ValObject.MomentumOut());
        }
        if(userchoice.equals("8"))
        {
            System.out.println("Please specify which equation you want to use:\n1. S=D/T\n2. T=D/S\n3. D=SxT");
            double responce = scannervariable.nextDouble();
            ValObject.SDT();
            if(responce == 1){
                //S=D/T
                System.out.println("Please enter your distance");
                double distance0 = scannervariable.nextDouble();
                System.out.println("Please enter you time");
                double time0 = scannervariable.nextDouble();
                double total0 = distance0 / time0;
                System.out.println("Y our total is"+total0);
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
            for(int i=0;i<1000;i++){
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
            ValObject.Modulus(enps_forceforyoungs, enps_areaforyoungs, enps_changeinlengthforyoungs, enps_originallength);
            System.out.printf(ValObject.ModOut());
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
            ValObject.kinetic(enps_Xmass, enps_Xspeed);
        }
        if(userchoice.equals("15")){
            ValObject.freq();
        }
        if(userchoice.equals("16")){
            ValObject.density();
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
            ValObject.EPMGH();
        }

        if(userchoice.equals("20")){
            //F=m*a
            ValObject.FMA();
        }
        if(userchoice.equals("21")) {
            ValObject.AlphaSCT();
        }
        if(userchoice.equals("22")) {
            ValObject.GFS();
        }
        if(userchoice.equals("23")){
            System.out.println("You have chosen to work out force applied onto an object\nPlease enter your spring constant");
            double enps_SPRINGC = scannervariable.nextDouble();
            System.out.println("Please enter your extension on object");
            double enps_EXT = scannervariable.nextDouble();
            double enps_TOTF = enps_SPRINGC * enps_EXT;
            System.out.println("Your total is "+enps_TOTF);
        }
        if(userchoice.equals("24")){
            ValObject.validate();
            System.out.println("Variable 2 equals "+variable2);
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
                (userchoice.equals("19")&!(userchoice.equals("20")
                &!userchoice.equals("21")&!(userchoice.equals("22") &!(userchoice.equals("23")&!(userchoice.equals("24"))))))))) {
            System.out.println("Please enter a valid input");
        }
    }
    public void SOHCAHTOA_(){
        Scanner input = new Scanner(System.in);
        System.out.println("You have chosen to work out sine theta, tan theta or cos theta");
        System.out.println("Please enter which option you would want to work out:\n1. Sin\n2. Cos\n3. Tan");
        double valueanswer = input.nextDouble();
        if(valueanswer == 1){
            System.out.println("Please enter your opposite");
            double opposite = input.nextDouble();
            System.out.println("Please enter your hypotenuse");
            double hypotenuse = input.nextDouble();
            double total_0 = opposite / hypotenuse;
            System.out.println("Your total is "+total_0+" degrees");
        }else if(valueanswer == 2){
            System.out.println("Please enter your adjacent angle");
            double adjacent = input.nextDouble();
            System.out.println("Please enter your hypotenuse");
            double hypotenuse1 = input.nextDouble();
            double total_1 = adjacent / hypotenuse1;
            System.out.println("Your total is "+total_1+" degrees");
        }else if(valueanswer == 3){
            System.out.println("Please enter your opposite");
            double opposite1 = input.nextDouble();
            System.out.println("Please enter your adjacent");
            double adjacent1 = input.nextDouble();
            double total_2 = opposite1 / adjacent1;
            System.out.println("Your total is "+total_2+" degrees");
        }else{
            validation skiploop = new validation();
            skiploop.CalObj.SOHCAHTOA_();
        }
    }
}


