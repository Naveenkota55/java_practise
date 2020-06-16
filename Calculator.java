public class Calculator {
    double a;
    double b;
    public Calculator(double a, double b){
        this.a=a;
        this.b=b;
    } 
    public double calAdd(){
        return this.a+this.b;
    }
    public double calSub(){
        return this.a-this.b;

    }
    public double calMul(){
        return this.a*this.b;
    }

    public double calDiv(){
        return this.a/ this.b;
    }
}