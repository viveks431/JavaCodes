//defining class car and giving it attributes to set and display the details

class Car 
{
    //Attributes
    private String make;
    private String model;
    private int year;

    public void setCarDetails(String make, String model, int year)
    {
        //set the values
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public void displayCarDetails()
    {
        //display the attributes
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year of manufacture: " + year);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        //creating object
        Car car = new Car();
        car.setCarDetails("Merc", "Benz", 2022);
        System.out.println("Car details: ");
        car.displayCarDetails();
    }
}