package Car;

public class Test {
    public static void main(String[] args) {


        Car car = new Car();

        car.name = "X5";
        car.price = 50.0;

        System.out.println(car.name);
        System.out.println(car.price);

        car.Start();
        car.Price();

        System.out.println("-------------");

        Car car1 = new Car();

        car1.name = "gtr";
        car1.price = 69.5;

        System.out.println(car1.name);

        car1.Price();

    }
}
