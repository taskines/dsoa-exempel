public class Car {
    // vi deklarerar String-variablen name
    private String name;

    // Två olika names, andra variable i klassen, andra funktions argument som finns bara här
    public Car(String name){
        this.name=name;
    }
public String getName(){
        return name;
}
public void setName(String name){
        this.name=name;
}
}
