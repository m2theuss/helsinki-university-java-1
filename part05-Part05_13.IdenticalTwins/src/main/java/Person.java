
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person compared = (Person)obj;
        if(name.equals(compared.name) 
                && birthday.equals(compared.birthday) 
                && height == compared.height
                && weight == compared.weight) {
            return true;
        }
        return false;
    }
}
