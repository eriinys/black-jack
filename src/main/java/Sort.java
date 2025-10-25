import java.util.ArrayList;
import java.util.Arrays;

public class Sort{
    private ArrayList<Hand> players;

    public void sortPlayers(ArrayList<Hand> players){
        int highestScore = -1;
        int scores;
        String winner = null;

        for(Hand player:players){
            scores = player.getValue();

            if (scores > 21){
                System.out.println(player.getPlayerName() + ", busted!");
            } else if (scores <= 21 && scores >= highestScore){
                    highestScore = scores;
                if (player.getValue() == highestScore){
                    winner = player.getPlayerName();
                }
            } else if (scores == highestScore){
                System.out.println("It's a tie!");
            }
        }
        System.out.println(winner + " is the winner!");
    }
}
