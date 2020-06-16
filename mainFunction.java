public class mainFunction {
    public static double salaryCalculator(double hoursPerWeek, double amountPerHour , double vacationHours){
        double weeklyPay= hoursPerWeek*amountPerHour;
        if (vacationHours<=0){
            return weeklyPay*52;}
        else {
            return ((hoursPerWeek*52)-vacationHours)*amountPerHour;
        }

    }
    public static void main(String args[]){
        Boolean condition1=true;
        Boolean condition2=false;
        Boolean Condition3=true;
        if (condition1==true && (condition2==true | Condition3==true)){
            double Salary= salaryCalculator(40,20,90);
            System.out.println(Salary);}
        else {
            System.out.println("could not pass");
        }

        

    }
}