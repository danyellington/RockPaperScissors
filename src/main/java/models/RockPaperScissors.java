package models;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors {
    String winner;

    public String playCombinations(String userOne, String userTwo) {
        if (userOne.equals("rock") && userTwo.equals("scissors")) {
            winner = "userOne";
        } else if (userOne.equals("rock") && userTwo.equals("paper")) {
            winner = "userTwo";
        } else if (userOne.equals("scissors") && userTwo.equals("rock")) {
            winner = "userTwo";
        } else if (userOne.equals("scissors") && userTwo.equals("paper")) {
            winner = "userOne";
        } else if (userOne.equals("paper") && userTwo.equals("rock")) {
            winner = "userOne";
        } else if (userOne.equals("paper") && userTwo.equals("scissors")) {
            winner = "userTwo";
        } else if (userOne.equals(userTwo)) {
            winner = "tie";
        }
        return winner;
    }
}
