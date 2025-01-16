public interface Shoppable {


    // redundant, eftersom vi är i en interface blir variablen automatisk konstant
    static final int SHOP_VERSION=1;

    double getPrice();

    int getStock();

    default String getCondition(){
        return "New";
    }

}
