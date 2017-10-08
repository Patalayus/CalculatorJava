public class validation {
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
        //p=m*v
         enps_momentumtotal = mass * velocity;
    }
    public String MomentumOut(){
        return String.format("Your momentum is "+enps_momentumtotal+"kgm/s");
    }
}
