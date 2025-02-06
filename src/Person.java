public class Person {

    String name;


    public Person(String name) {
        this.name = name;
    }
    public Person(String name, Person next) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
