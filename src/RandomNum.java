import java.util.Random;

public class RandomNum {

    Random random = new Random();
    private int number;
    private String name;

    public RandomNum (String name){
       this.name=name;
       number= random.nextInt(1,100);
    }

    public int getNumber() {
        return number;
    }
}
