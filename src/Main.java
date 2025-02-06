
import java.util.Scanner;

public class Main {
    // Konstant med tstaic final, SÅDANT SOM INTE ÄNDRAR
    static final String PROGRAM_VERSION = "1.0";
    static final int DAYS_IN_WEEK = 7;


    public static void main(String[] args) {


        Queuey queuey= new Queuey();
        Graphy graphy= new Graphy();
        queuey.enqueu("Zozo");
        queuey.enqueu("Ruuben");
        queuey.enqueu("Kimi");
        System.out.println(queuey.toString());
        System.out.println("First in line: "+ queuey.peek());

        System.out.println("DEQUEUE: "+queuey.dequeue());
        System.out.println(queuey.toString());

        String[] testData = {"ZOZO", "Ruuben", "Kimi", "Wille"};
        String[] sortedData = {"Kimi", "Ruuben", "Wille", "zozo"};

        String [] weekDays= {"må","ti","on","to", "fr", "lö", "sö"};

        int today=3;  //torsdag
        System.out.printf("Idag är det %s\n", weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[(today+2)% weekDays.length]);
        System.out.printf("Om 6 dagar är det %s\n", weekDays[(today+6)% weekDays.length]);

        /**
         * Stack
         */
        Stacky stacky = new Stacky(5);
        stacky.push("zozo");
        stacky.push("ruuben");
        stacky.push("kimi");
        stacky.push("Juuuu");
        stacky.push("VVVVV");
        System.out.println(stacky.toString());



        /**
         * Linked list
         */
        Person frodo = new Person(testData[0]);
        Person sam = new Person(testData[1]);
        Person gandalf = new Person(testData[2]);
        Person wille = new Person(testData[3]);

        Linky linky = new Linky();
        linky.add(frodo);
        linky.add(sam);
        linky.add(gandalf);


        System.out.println(linky.toString());
        System.out.println("Linky has:" + linky.size());
        linky.add(wille);
        System.out.println(linky.toString());
        System.out.println("Linky has:" + linky.size());


      /* Person p1= new Person(testData[0]);
        Person p2= new Person(testData[1], p1);
        Person p3= new Person(testData[2],p2);
        Person p4= new Person(testData[3],p3);




        Person current=p4;

        while(current !=null){
            System.out.println(current.getName());
            current=current.next;
        }
 */

       /* StringArray names = new StringArray(sortedData);
        System.out.println(names.toString());
        names.add("Gollum");
        System.out.println(names.toString());

        names.reverse();
        System.out.println(names.toString());


        System.exit(0);
        // testa looppa olika tidskomplixitet
        new BigO();

        */


        //upcasting
        //Vehicle car = new Car("Toyota", 3000.0);
        //Vehicle bike = new Bike("Scott", 100);
        //Car car2 = new Car("Fiat");
        //car2.refuel();
        //Car car3 = new Car(2000.0);
        //Car car4 = new Car("Tesla", 2000.0);
        //Vehicle todaysVehicle;
        //todaysVehicle = car;
        //todaysVehicle = bike;
        // default-konstruktor
        //Foo foo = new Foo();
        //upcasting
        //Clothing shirt = new Shirt("Red", "Polo", 100);
        //Shirt shirt2 = new Shirt("Yellow", "Nike", 99.9999);
        //Pants pants= new Pants("Black", "Levis", "150$");


        //FileUtils.writeTextFile("Hello file", "hello.txt");
        // System.out.println(FileUtils.readTextFile("hello.txt"));
        //Customer customer;
        //  Object loadedObject = FileUtils.loadObject("customer.save");
        //if (loadedObject != null) {
         /*   customer = (Customer) loadedObject;
        } else {
            customer = new Customer(1500);
        }

        System.out.printf("Välkommen till cykelbutiken. Du har %.2f euro och %s.",
                customer.getFunds(),
                (customer.getCurrentBike()) == null ? "ingen cykel" : customer.getCurrentBike().getName()
        );

        BikeShop shop = new BikeShop();
        shop.addBike(BikeFactory.createExpensiveBike("Scott"));
        shop.addBike(BikeFactory.cheapExpensiveBike("Pask"));
        shop.addBike(new Bike("Helkama", 90, DiscountCategory.DEMO));
        shop.addBike(new Bike("Niskahiki", 5000, DiscountCategory.RETURNED));


        for (int i = 0; i < shop.getBikeCount(); i++) {

            System.out.printf("\n%d - %s %.2f € (%.2f) lagersaldo: %s %s\n",
                    i,
                    shop.getBike(i).getName(),
                    shop.getBike(i).getPrice(),
                    shop.getBike(i).getGrossPrice(),
                    shop.getBike(i).getStock(),
                    shop.getBike(i).getDiscountCat()
            );
            System.out.println(shop.getBike(i).getFeatures());
        }


        String userInput;
        while (true) {

            System.out.print("Vilken cykel vill du köpa? (q för quit)");

            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Tack, välkommen åter!");
                break;
            }
            if (!Utils.isInteger(userInput)) {
                System.out.println("Du måste ge ett heltal!");
                continue;
            }

            int bikeIndex = Integer.parseInt(userInput);
            if (bikeIndex >= shop.getBikeCount()) {
                System.out.println("Det finns ingen sådan cykel!");
            }

            if (!customer.buyBike(shop.getBike(bikeIndex))) {
                System.out.println("Du har inte råd med den cykeln");
                continue;
            }


            System.out.printf("Grattis, du köpte en %s för %.2f\n",
                    shop.getBike(bikeIndex).getName(),
                    shop.getBike(bikeIndex).getPrice()
            );
            break;
        }
        FileUtils.saveObject(customer, "customer.save");

        // int userIntInput= Utils.getIntInput();  code challenge

        // shop.getBike(0).addFeature("suspension", "hardtail");
        // shop.getBike(0).addFeature("wheelsize", "24-inch");
        // System.out.println(shop.getBike(0).getFeature("suspension"));
        //System.out.println(shop.getBike(0).getFeature("wheelsize"));

      /*
        System.out.println("Här genereras slumptal!(q för exit)");
        String userInput1;


        while (true) {

            RandomNum x= new RandomNum();
            userInput1 = scanner.nextLine();

            {
                if (userInput1.equalsIgnoreCase("")) {
                    System.out.println("Slumptal: " + x.getNumber());
                } else if (userInput1.equalsIgnoreCase("q")) {
                    break;
                }

            }




        }
*/


// Konkatenering:

    /*    System.out.println(shirt.getBrand());
            System.out.println(shirt2.getCondition());
            System.out.println(shirt2.getBrand() + " kostar " + shirt2.getPrice() + " lagersaldo: " + shirt2.getStock());
            System.out.printf("%s kostar %.2f €, lagersaldo: %d st\n",
                    shirt2.getBrand(),
                    shirt2.getPrice(),
                    shirt2.getStock());
            // String format () returnerar en string             shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d st",
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
            //System.out.println("These jeans are "+pants.getColor()+" they are made by "+ pants.getBrand()+" which is why they cost "+pants.getPrice());*/
    }


}

