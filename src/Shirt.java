public class Shirt extends Clothing implements Shoppable{

    public Shirt (String color, String brand, double price){
        super.color=color;
        super.brand=brand;
        super.price=price;
    }
    @Override
    void mend(){
     this.condition=90;
    }

    @Override
    public int getStock() {
        return 0;
    }
}
