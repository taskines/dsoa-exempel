import java.util.Arrays;

public class Sorty {


    private String[] values;


    public Sorty(String [] values){

        System.out.println("Values length: "+values.length);
        this.values=values.clone(); //skapar en deep copy

    }
    public void insertionSort (){
        int ops=0;
        for (int i = 1; i < values.length; i++) {
            String curVal= values[i];
          int  j= i-1;
            while(j>=0 && values[j].compareTo(curVal)>0){
                values[j+1]=values[j];
                j--;
                ops++;
            }
            values[j+1]=curVal;
        }
        System.out.println("Insertion Sort operations: "+ops);
    }


    public void bubbleSort(){
       int  ops=0;
       //yttre loop
        for (int i = 0; i < values.length; i++) {

            //inre loop som göör jälva sorteringen
            for (int j = 1; j < values.length-i; j++) {
                //swappa om det första i paret är störr eän det andra
                if(values[j-1].compareTo(values[j])>0){
                    String temp= values[j-1];
                    values[j-1]=values[j];
                    values[j]=temp;
                    ops++;
                }

            }
        }

        System.out.println("Bubble Sort operations: "+ops);

    }
    public String[] getValues(){
        return values;
    }

    @Override

    public String toString(){
        return Arrays.toString(values);
    }
}
