package ChessKnightMoves;

public class Start {
  Input input = new Input();
  Knight knight = new Knight(0,0);


  public void start() {
    String initialCell = input.getStartCell();
    knight.setxCoordinate(initialCell.charAt(0));
    knight.setyCoordinate(initialCell.charAt(1));
  }
}
