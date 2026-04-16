import java.util.ArrayList;
public class Room{
    private ArrayList<Person> personList;

    public Room(){
        personList = new ArrayList<>();
    }
    public void add(Person person){
        personList.add(person);
    }
    public boolean isEmpty(){
        if(personList.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return personList;
    } 
    public Person shortest(){
        if(personList.isEmpty()){
            return null;
        }
        Person shortestPerson = personList.get(0);
        for(Person item : personList){
            if(item.getHeight() < shortestPerson.getHeight()){
                shortestPerson = item;
            }
        }
        return shortestPerson;
    }
    public Person take(){
        Person tmp = shortest();
        personList.remove(shortest());
        return tmp;
    }
}