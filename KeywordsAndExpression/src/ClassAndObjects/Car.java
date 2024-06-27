package ClassAndObjects;

public class Car {

    private String make;
    private String model;
    private String color ;
    private int door;
    private boolean convertible ;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    public void setMake(String make)
    {
        this.make=make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoor() {
        return door;
    }

    public void describeCar()
    {
        System.out.println(door + "doors" + color+"color" + make +"make "+model+"model"+
        (convertible? "Convertible":""));

    }
}
