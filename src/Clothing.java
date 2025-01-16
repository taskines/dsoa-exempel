abstract class Clothing {


    String color;
    String brand;
    double price;


    public String getColor() {
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand (String brand) {
        this.brand=brand;
    }

    int condition=0;

    abstract void mend();

}
