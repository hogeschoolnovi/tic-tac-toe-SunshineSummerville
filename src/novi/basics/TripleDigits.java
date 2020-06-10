package novi.basics;

import java.util.Scanner;

public class TripleDigits {
    public static void TripleDigits() {
        //public static void TripleDigits(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        // write your code here

        // Stel vraag/doel; wat zijn de 3 getallen?
        System.out.println("Wat zijn de 3 getallen?");

        // maak de te raden getallen aan (create the numbers that need to be guessed)
        int safeCodeA = 2;
        int safeCodeB = 2;
        int safeCodeC = 3;

        // bereken de som - A + B + C- en het product - A* B* C - van deze getallen (calculate de sum and the product of these numbers)
        int safeCodeSum = safeCodeA + safeCodeB + safeCodeC;
        int safeCodeProduct = safeCodeA * safeCodeB * safeCodeC;

        // som en product weergeven ( show sum and product)
        System.out.println("the sum =:" + safeCodeSum);
        System.out.println("the product =:" + safeCodeProduct);


        // vragen aan de speler om de getallen in te voeren
        System.out.println("fill in the answer by typing numbers next to each other or underneath each other" + playerInput);

        // krijg de getallen van de speler (receive the numbers of the player)
        int playerGuessA = playerInput.nextInt();
        int playerGuessB = playerInput.nextInt();
        int playerGuessC = playerInput.nextInt();

        System.out.println(" Given answer =: " + playerGuessA + playerGuessB + playerGuessC);


        // kijken of het antwoord goed is (check/analyze if the answer is correct)
        // zeggen dat de speler zijn antwoord goed is
        // Anders
        //  zeggen dat gegeven antwoord fout is en zeggen dat de speler het opnieuw mag proveren
    }
}
