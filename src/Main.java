public class Main {
    public static void main(String[] args) {


        //upcasting
        Vehicle car= new Car("Toyota",3000.0);
        Vehicle bike= new Bike("Scott");



        Car car2=new Car("Fiat");
        car2.refuel();

        Car car3= new Car(2000.0);

        Car car4=new Car("Tesla",2000.0);

        Vehicle todaysVehicle;
        todaysVehicle=car;
        todaysVehicle=bike;

        System.out.println("Idag åker jag "+ todaysVehicle.getName());
        //upcasting



        Shirt shirt= new Shirt("Red", "Polo","20$");
        Shirt shirt2= new Shirt("Yellow", "Nike","100$");

        Pants pants= new Pants("Black", "Levis", "150$");



       // car.setPrice(-1000.0);, kontrollering för runtime juttun

        System.out.println("Bilen " + car.getName()+" kostar " + car.getPrice());
        System.out.println(car.soundWarning());
        System.out.println(car.getName()+ " is "+ car.getType());
        System.out.println(bike.getName()+ " is "+ bike.getType());
        System.out.println(bike.soundWarning());

        System.out.println("This shirt is "+ shirt.getColor() +" and the brand is " + shirt.getBrand()+ " the price is "+ shirt.getPrice());
        System.out.println("This one on the other hand is "+ shirt2.getColor()+" and the brand is " + shirt2.getBrand()+" the price is "+shirt2.getPrice());
        System.out.println("These jeans are "+pants.getColor()+" they are made by "+ pants.getBrand()+" which is why they cost "+pants.getPrice());
    }
}
