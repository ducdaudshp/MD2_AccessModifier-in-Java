public class Circle {
    private double radius=1.0;
    private String color="red";
   public Circle(){

    }
    public Circle(double r){
        radius=r;
    }
    public double getRadius(){
       return radius;
    }
    public double getArea(){
       return Math.PI*Math.pow(radius,2);
    }
}
