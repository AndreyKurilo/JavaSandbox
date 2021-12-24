package ChessKnightMoves;

import java.util.Scanner;

public class Input {

  private final Scanner scanStartCell;

  public Input() {
    scanStartCell = new Scanner(System.in);}


    public String getStartCell() {
      System.out.println("Enter start cell as double symbol");
      System.out.println("First symbol - horizontal - from this set: A, B, C, D, E, F, G, H");
      System.out.println("Second symbol - vertical - digit from 1-8");
      System.out.println("For example G7");
      return scanStartCell.nextLine();
  }
}
