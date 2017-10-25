import java.util.Scanner;

public class validation {
    //validation nextone = new validation();

    calculator CalObj = new calculator();
    double enps_AxC;
    double enps_4xAC;
    double enps_BxB;
    double enps_BB_4xAC;
    double enps_SqrtB_4xAC;
    double enps_top;
    double enps_total;
    double enps_top2;
    double enps_total2;
    double enps_momentumtotal;
    double all;
    double suball;
    double modfin;
    double divtot;
    public double appendthis;
    Scanner thisscan = new Scanner(System.in);


    public void validate(){
        calculator.variable2 +=1;
    }
    public void Quadratic(double A, double B, double C){
        //-b+-/b^2-4(a*c)
        //---------------
        //     2a
        enps_AxC = A*C;
        enps_4xAC = 4*enps_AxC;
        enps_BxB = B*B;
        enps_BB_4xAC = enps_BxB - enps_4xAC;
        enps_SqrtB_4xAC = Math.sqrt(enps_BB_4xAC);
        enps_top = -B+enps_SqrtB_4xAC;
        enps_top2 = -B-enps_SqrtB_4xAC;
        enps_total = enps_top/2*A;
        enps_total2 = enps_top2/2*A;
    }
    public String output(){
        return String.format("Your positive is "+enps_total+ "Your negative is "+enps_total2);
    }
    public void Momentum(double mass, double velocity){
         enps_momentumtotal = mass * velocity;
    }
    public String MomentumOut(){
        return String.format("Your momentum is "+enps_momentumtotal+"kgm/s");
    }
    public void Add(double first, double second){
        all = first + second;
    }
    public String outadd(){
        return String.format(""+all);
    }
    public void subtract(double first2, double second2){
        suball = first2 - second2;
    }
    public String subfin(){
        return String.format(""+suball);
    }
    public void Modulus(double F, double A, double DL, double L){
        modfin = (F/A)/(DL/L);
    }
    public String ModOut(){
        return String.format("Your Young's Modulus is "+modfin);
    }
    public void AlphaSCT(){
        CalObj.SOHCAHTOA_();
    }
    public void back(){
        CalObj.SOHCAHTOA_();
    }
    public String SDT(){
        return String.format("Please specify which equation you want to use:\n1. S=D/T\n2. T=D/S\n3. D=SxT");
    }
    public void div(double div1, double div2){
        divtot = div1 / div2;
    }
    public String outdiv(){
        return String.format(""+divtot);
    }
    public void modnum(double first, double second){
        Scanner thisscan = new Scanner(System.in);
        double totalmodnum = first % second;
        System.out.println("Your total is "+totalmodnum);
    }
}
