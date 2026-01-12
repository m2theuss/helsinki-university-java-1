
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String filePath = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        try(Scanner file = new Scanner(Paths.get(filePath))){
            int amoutOfGames = 0;
            int losses = 0;
            int wins = 0;

            while(file.hasNextLine()){
                String[] values = file.nextLine().split(",");
                String homeTeam = values[0];
                String visitTeam = values[1];
                int homePoint = Integer.valueOf(values[2]);
                int visitPoint = Integer.valueOf(values[3]);

                if(homeTeam.equals(teamName)){
                    amoutOfGames++;
                    if(homePoint > visitPoint){
                        wins++;
                    }else{
                        losses++;
                    }
                }else if(visitTeam.equals(teamName)){
                    amoutOfGames++;
                    if(visitPoint > homePoint){
                        wins++;
                    }else{
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + amoutOfGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch(Exception e){
            System.out.println("A error ocorred: " + e.getMessage());
        }
    }

}
