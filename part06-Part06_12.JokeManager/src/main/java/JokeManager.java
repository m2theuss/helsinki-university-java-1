import java.util.ArrayList;
import java.util.Random;
public class JokeManager{
    private ArrayList<String> jokesList;

    public JokeManager(){
        this.jokesList = new ArrayList<>();
    }
    public void addJoke(String joke){
        jokesList.add(joke);
    }
    public String drawJoke(){
        Random rand = new Random();
        if(jokesList.isEmpty()){
            return "Jokes are in short supply.";
        }
        System.out.println("Printing jokes:");
        return jokesList.get(rand.nextInt(jokesList.size()));
    }
    public void printJokes(){
        System.out.println("Printing jokes:");
        for(String item : jokesList){
            System.out.println(item);
        }
    }

}