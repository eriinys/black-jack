import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hand> players = new ArrayList<>();
        ArrayList<String> defaultName = new ArrayList<>();
        defaultName.add("player2");
        defaultName.add("player3");
        defaultName.add("player4");
        defaultName.add("player5");
        defaultName.add("player6");
        defaultName.add("player7");

        System.out.println("Welcome to BlackJack🃏\n" +
                "Please enter your name: ");
        String player = scanner.nextLine();
        Hand player1 = new Hand(player);
        players.add(player1);

        System.out.println("Enter number of players:");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfPlayers - 1; i++){
            String name = defaultName.get(i);
            players.add(new Hand(name));
        }




    }


}
