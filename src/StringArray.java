import java.util.Arrays;

public class StringArray {


    String [] values;


    public StringArray(String[] values) {
        System.out.println("New stringArray");
        this.values = values;
    }


    public void add(String value){
        System.out.println("Add "+ value);
        String [] newValues = new String[values.length+1];
        for (int i = 0; i < values.length; i++) {
            newValues[i]= values[i];

        }
        newValues[values.length]=value;
        values=newValues;
    }
    public void reverse(){
        String [] reversedValues = new String[values.length];
        for (int i = 0; i < values.length; i++) {
               reversedValues[i]= values[values.length-1-i];
        }
       values= reversedValues;
    }


    public String toString(){
        return Arrays.toString(values);
    }

}
