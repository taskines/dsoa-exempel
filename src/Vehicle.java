public class Vehicle {


    private  String name;
    private  String type;
    private double price=0.0;
    double discount=0.9;


    public Vehicle(String name, String type) {
        this.type = type;
        this.name = name;
    }


    public String soundWarning(){
        return "default sound";
    }



    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    public double getGrossPrice() {
        return price;
    }

    public double getPrice(){
        return price*discount;
    }
    public void setPrice(Double price){
        if(price<0)throw new RuntimeException("Bad Price!");
        this.price=price;
    }
}
