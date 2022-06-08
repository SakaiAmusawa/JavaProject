package Car;

public class Test {
    public static void main(String[] args) {


        Car car1 = new Car();

        car1.name = "X5";
        car1.price = 50.0;

        System.out.println(car1.name);
        System.out.println(car1.price);

        car1.Start();
        car1.Price();

        System.out.println("-------------");

        Car car2 = new Car();

        car2.name = "gtr";
        car2.price = 69.5;

        System.out.println(car2.name);

        car2.Price();

    }
}
