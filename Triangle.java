public class Triangle {
    double side;
    double height;
    double base;
    public Triangle(double side, double height, double base){
        this.side=side;
        this.height=height;
        this.base=base;}

    public double findArea(){
        return (this.side* this.height * this.base);

    }
}