package ChessKnightMoves;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Input {

  private final Scanner scanStartCell;
  private String initialCell = "Z9";

  public Input() {
    scanStartCell = new Scanner(System.in);}


    public String getStartCell() {

      HashSet<Character> firstSymbolSet = new HashSet<>();
      firstSymbolSet.add('A');
      firstSymbolSet.add('B');
      firstSymbolSet.add('C');
      firstSymbolSet.add('D');
      firstSymbolSet.add('E');
      firstSymbolSet.add('F');
      firstSymbolSet.add('G');
      firstSymbolSet.add('H');
      char firstSymbol;
      int secondSymbol;

      do {
        System.out.println("Enter start cell as double symbol");
        System.out.println("First symbol - horizontal - from this set: A, B, C, D, E, F, G, H");
        System.out.println("Second symbol - vertical - digit from 1-8");
        System.out.println("For example G7");
        initialCell = scanStartCell.nextLine();
        firstSymbol = Character.toUpperCase(initialCell.charAt(0));
        secondSymbol = Integer.parseInt(String.valueOf(initialCell.charAt(1)));
      }
        while ((!firstSymbolSet.contains(firstSymbol)) ||  secondSymbol < 0
                || secondSymbol > 8);

      return initialCell;
  }

}
