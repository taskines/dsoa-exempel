public class Main {
    public static void main(String[] args) {

        Car car= new Car("Toyota");
        Car otherCar=new Car("Volvo");
        Bike bike= new Bike("Scott");

        Shirt shirt= new Shirt("Red", "Polo","20$");
        Shirt shirt2= new Shirt("Yellow", "Nike","100$");

        Pants pants= new Pants("Black", "Levis", "150$");


        System.out.println(car.getName()+ " is "+ car.getType());
        System.out.println(bike.getName()+ " is "+ bike.getType());

        System.out.println("This shirt is "+ shirt.getColor() +" and the brand is " + shirt.getBrand()+ " the price is "+ shirt.getPrice());
        System.out.println("This one on the other hand is "+ shirt2.getColor()+" and the brand is " + shirt2.getBrand()+" the price is "+shirt2.getPrice());
        System.out.println("These jeans are "+pants.getColor()+" they are made by "+ pants.getBrand()+" which is why they cost "+pants.getPrice());
    }
}
