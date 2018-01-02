import models.RockPaperScissors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/2/18.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("userOne: pick rock, paper, or scissors");
        try {
            String stringUserOneChoice = bufferedReader.readLine();
            System.out.println("userTwo: pick rock, paper, or scissors");
            String stringUserTwoChoice = bufferedReader.readLine();
            RockPaperScissors gameRockPaperScissors = new RockPaperScissors();
           System.out.println("The winner is " + gameRockPaperScissors.playCombinations(stringUserOneChoice, stringUserTwoChoice));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
