package Activities;

public class Car {
    String Colour;
    String Transmission;
    int make;
    int tyres;
    int doors;

    public Car() {
        Colour = "red";
        Transmission = "Manual";
        make = 1980;
        tyres = 4;
        doors = 2;

    }

    public static void main(String[] args) {
        Car santro = new Car();
        System.out.println("Colour of the car  " + santro.Colour);

    }
}


