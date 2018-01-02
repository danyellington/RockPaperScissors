import org.junit.Test;
import models.RockPaperScissors;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    @Test
    public void playCombinations_rockVscissors_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
//            String playCombination = testRockPaperScissors.playCombinations("rock", "scissors");
        String expected = "userOne";
        assertEquals(expected, testRockPaperScissors.playCombinations("rock", "scissors"));
    }

    @Test
    public void playCombinations_rockVpaper_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "userTwo";
        assertEquals(expected, testRockPaperScissors.playCombinations("rock", "paper"));
    }
    @Test
    public void playCombinations_rockVrock_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testRockPaperScissors.playCombinations("rock", "rock"));
    }
    @Test
    public void playCombinations_scissorsVrock_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "userTwo";
        assertEquals(expected, testRockPaperScissors.playCombinations("scissors", "rock"));
    }
    @Test
    public void playCombinations_scissorsVpaper_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "userOne";
        assertEquals(expected, testRockPaperScissors.playCombinations("scissors", "paper"));
    }
    @Test
    public void playCombinations_scissorsVscissors_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testRockPaperScissors.playCombinations("scissors", "scissors"));
    }
    @Test
    public void playCombinations_paperVrock_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "userOne";
        assertEquals(expected, testRockPaperScissors.playCombinations("paper", "rock"));
    }
    @Test
    public void playCombinations_paperVscissors_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "userTwo";
        assertEquals(expected, testRockPaperScissors.playCombinations("paper", "scissors"));
    }
    @Test
    public void playCombinations_paperVpaper_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testRockPaperScissors.playCombinations("paper", "paper"));
    }
}
