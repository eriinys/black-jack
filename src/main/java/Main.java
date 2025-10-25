import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Sort sort = new Sort();
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
        String mainPlayer = scanner.nextLine();
        Hand player1 = new Hand(mainPlayer);
        players.add(player1);

        System.out.println("Enter number of players:");
        boolean in = true;
        while(in) {
            try {
                int numberOfPlayers = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < numberOfPlayers - 1; i++) {
                    String name = defaultName.get(i);
                    players.add(new Hand(name));
                }
                in = false;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number");
            }
        }

            String[] message1 = {
                    "Starting game in ",
                    "3...",
                    "2...",
                    "1\n"
            };
            for (String msg : message1) {
                System.out.print(msg);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        int bestScore = 0;

        String[] message2 = {
                "Dealing cards",
                ".",
                ".",
                ".\n",
        };
        for (String msg : message2){
            System.out.print(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }

        deck.shuffle();
        for(Hand player : players){
            for(int i = 0; i < 2; i++) {
                Card card = deck.deal();
                player.deal(card);
            }
            int playerValue = player.getValue();
            System.out.printf("%s is worth %d points\n", player.getPlayerName(),  playerValue);
        }
        sort.sortPlayers(players);
    }


}
