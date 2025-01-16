
import java.util.ArrayList;

public class Main {
    // Konstant med tstaic final, SÅDANT SOM INTE ÄNDRAR
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {


        //upcasting
        Vehicle car = new Car("Toyota", 3000.0);
        Vehicle bike = new Bike("Scott",100);
        Car car2 = new Car("Fiat");
        car2.refuel();
        Car car3 = new Car(2000.0);
        Car car4 = new Car("Tesla", 2000.0);
        Vehicle todaysVehicle;
        todaysVehicle = car;
        todaysVehicle = bike;
        // default-konstruktor
        Foo foo = new Foo();
        //upcasting
        Clothing shirt = new Shirt("Red", "Polo", 100);
        Shirt shirt2 = new Shirt("Yellow", "Nike", 99.9999);
        //Pants pants= new Pants("Black", "Levis", "150$");

        BikeShop shop= new BikeShop();
        shop.addBike(new Bike("Jopo",600));
        shop.addBike(new Bike("Helkama",90));
        shop.addBike(new Bike("Niskahiki",5000));

        System.out.println("Välkommen till BikeShop! Våra cyklar;" );

        for (int i=0; i<shop.getBikeCount();i++){

            System.out.printf("%s %.2f € lagersaldo: %s\n",
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getStock()
                    );
        }

        System.exit(0);

// Konkatenering:
        System.out.println(shirt.getBrand());
        System.out.println(shirt2.getCondition());
        System.out.println(shirt2.getBrand() + " kostar " + shirt2.getPrice() + " lagersaldo: " + shirt2.getStock());
        System.out.printf("%s kostar %.2f €, lagersaldo: %d st\n",
                shirt2.getBrand(),
                shirt2.getPrice(),
                shirt2.getStock());
        // String format () returnerar en string
        String shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d st",
                shirt2.getBrand(),
                shirt2.getPrice(),
                shirt2.getStock());
        System.out.println(shirtInfo);


        //car.setPrice(-1000.0);, kontrollering för runtime juttun
        //System.out.println("Idag åker jag "+ todaysVehicle.getName());
        //System.out.println("Bilen " + car.getName()+" kostar " + car.getPrice());
        //System.out.println(car.soundWarning());
        //System.out.println(car.getName()+ " is "+ car.getType());
        //System.out.println(bike.getName()+ " is "+ bike.getType());
        //System.out.println(bike.soundWarning());
        //System.out.println("This shirt is "+ shirt.getColor() +" and the brand is " + shirt.getBrand()+ " the price is "+ shirt.getPrice());
        //System.out.println("This one on the other hand is "+ shirt2.getColor()+" and the brand is " + shirt2.getBrand()+" the price is "+shirt2.getPrice());
        //System.out.println("These jeans are "+pants.getColor()+" they are made by "+ pants.getBrand()+" which is why they cost "+pants.getPrice());
    }
}
