package ClassAndObjects;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.setMake("Tornado");
        car.setModel("Tornsado 11");
        car.setColor("Mate Black");
        car.setDoor(3);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getDoor());
    }
}
