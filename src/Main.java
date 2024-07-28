public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle(3.75);
        System.out.println("Radius ="+circle1.getRadius());
        System.out.println("Area ="+circle1.getArea());

        Cylinder cylinder= new Cylinder(5.55,7.25);
        System.out.println("radius of the cylinder ="+cylinder.getRadius());
        System.out.println("area of the cylinder="+cylinder.getArea());
        System.out.println("height of the cylinder ="+cylinder.getHeight());
        System.out.println("Volume of the cylinder ="+cylinder.getVolume());
    }
}