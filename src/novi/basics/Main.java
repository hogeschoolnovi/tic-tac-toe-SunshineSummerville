package novi.basics;
import java.util.Scanner;
public class Main {
    public static Scanner PLAYERINPUT = new Scanner(System.in);

    public static void main(String[] args) {

        // -- vanaf hier gaan we het spel opnieuw spelen met andere spelers (nadat op het eind  keuze 2 gekozen is)
        // de 1e speler om zijn naam vragen
        System.out.println("Player 1, what is your name?");
        // de naam van de 1e speler opslaan
        String player1Name = PLAYERINPUT.next();
        Player player1 = new Player(player1Name,'x');
        // de 2e speler om zijn naam vragen
        System.out.println("Player 2, what is your name?");
        // de naam van de 2e speler opslaan
        String player2Name = PLAYERINPUT.next();
        Player player2 = new Player(player2Name,'o');
        TicTacToe game = new TicTacToe(player1, player2);
        int spelkeuze;
        spelkeuze = ChooseGame();
        if (spelkeuze == 1) {
            TicTactoe.play();
        } else {
            TripleDigits.play;
        }
        // speler spel laten kiezen --> TicTacToe of TripleDigits

        }
        // vragen of de spelers nog een keer willen spelen
        //1: nog een keer spelen
        //2: van spelers wisselen
        //3: afsluiten
        // speler keuze opslaan
        // bij keuze 1: terug naar het maken van het bord
        // bij keuze 2: terug naar de start van de applicatie en het vragen van spelernamen
        // bij keuze 3: het spel en de applicatie helemaal afsluiten
    }

    private static int ChooseGame() {
        System.out.println("Which game do you wish to play?");
        System.out.println("Press 1 for Tictactoe or press 2 for TripleDigits");
        Scanner welkspel = new Scanner(System.in);
        int inputInt;
        inputInt = welkspel.nextInt();
        return inputInt;
    }

}