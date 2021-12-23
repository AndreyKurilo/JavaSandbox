package ChessKnightMoves;

public class Knight {
  private int xCoordinate;
  private int yCoordinate;
  private int nextX = xCoordinate;
  private int nextY = yCoordinate;


  public Knight(){};

  public Knight(int xCoordinate, int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  public void setxCoordinate(char xCoordinate) {
    switch (xCoordinate) {
      case 'A': this.xCoordinate = 0;
      break;
      case 'B': this.xCoordinate = 1;
      break;
      case 'C': this.xCoordinate = 2;
        break;
      case 'D': this.xCoordinate = 3;
        break;
      case 'E': this.xCoordinate = 4;
        break;
      case 'F': this.xCoordinate = 5;
        break;
      case 'G': this.xCoordinate = 6;
        break;
      case 'H': this.xCoordinate = 7;
        break;
      default:
        System.out.println("Wrong cell name");
        break;
    }
  }

  public void setyCoordinate(char yCoordinate) {
    switch (yCoordinate) {
      case '1': this.yCoordinate = 7;
        break;
      case '2': this.yCoordinate = 6;
        break;
      case '3': this.yCoordinate = 5;
        break;
      case '4': this.yCoordinate = 4;
        break;
      case '5': this.yCoordinate = 3;
        break;
      case '6': this.yCoordinate = 2;
        break;
      case '7': this.yCoordinate = 1;
        break;
      case '8': this.yCoordinate = 0;
        break;
      default:
        System.out.println("Wrong cell name");
        break;
    }
  }

  public void setStartCell(){
    Input input = new Input();
    String initialCell = input.getStartCell();
    setxCoordinate(initialCell.charAt(0));
    setyCoordinate(initialCell.charAt(1));
  }

  public void move(){
    ChessTable chessTable = new ChessTable();

    for (int i = 0; i < 64; i++) {
      chessTable.getChessTable()[xCoordinate][yCoordinate] = 10;
      chessTable.changeCellsAfterMove(xCoordinate, yCoordinate);
      searchNeededCell(xCoordinate, yCoordinate, chessTable);
      System.out.println();
      System.out.println("Chess Knight Move № " + i);
      chessTable.printChessTable();
      if (nextX != xCoordinate && nextY != yCoordinate) {
        System.out.println("Knight cannot move");
        break;
      }
    }
  }

  private void searchNeededCell(int xCoordinate, int yCoordinate, ChessTable chessTable) {
    if ((xCoordinate - 1) >=0 && (xCoordinate - 1) <8) {
      if ((yCoordinate - 2) >= 0 && (yCoordinate - 2) < 8) {
        if (chessTable.getChessTable()[xCoordinate - 1][yCoordinate - 2] < 10) {
          nextX = xCoordinate - 1;
          nextY = yCoordinate - 2;
        }
          chessTable.getChessTable()[xCoordinate - 1][yCoordinate - 2]
                  = chessTable.getChessTable()[xCoordinate - 1][yCoordinate - 2]--;
      }
    }
    if ((xCoordinate - 1) >=0 && (xCoordinate - 1) <8) {
      if ((yCoordinate + 2) >= 0 && (yCoordinate + 2) < 8) {
        if (chessTable.getChessTable()[xCoordinate - 1][yCoordinate + 2] != 10) {
          if (chessTable.getChessTable()[xCoordinate - 1][yCoordinate + 2]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate - 1;
            nextY = yCoordinate + 2;
          }
        }
      }
    }
    if ((xCoordinate - 2) >=0 && (xCoordinate - 2) <8) {
      if ((yCoordinate - 1) >= 0 && (yCoordinate - 1) < 8) {
        if (chessTable.getChessTable()[xCoordinate - 2][yCoordinate - 1] != 10){
          if (chessTable.getChessTable()[xCoordinate - 2][yCoordinate - 1]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate - 2;
            nextY = yCoordinate - 1;
          }
        }
      }
    }
    if ((xCoordinate - 2) >=0 && (xCoordinate - 2) <8) {
      if ((yCoordinate + 1) >= 0 && (yCoordinate + 1) < 8) {
        if (chessTable.getChessTable()[xCoordinate - 2][yCoordinate + 1] != 10){
          if (chessTable.getChessTable()[xCoordinate - 2][yCoordinate + 1]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate - 2;
            nextY = yCoordinate + 1;
          }
        }
      }
    }
    if ((xCoordinate + 1) >=0 && (xCoordinate + 1) <8) {
      if ((yCoordinate - 2) >= 0 && (yCoordinate - 2) < 8) {
        if (chessTable.getChessTable()[xCoordinate + 1][yCoordinate - 2] != 10){
          if (chessTable.getChessTable()[xCoordinate + 1][yCoordinate - 2]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate + 1;
            nextY = yCoordinate - 2;
          }
        }
      }
    }
    if ((xCoordinate + 1) >=0 && (xCoordinate + 1) <8) {
      if ((yCoordinate + 2) >= 0 && (yCoordinate + 2) < 8) {
        if (chessTable.getChessTable()[xCoordinate + 1][yCoordinate + 2] != 10){
          if (chessTable.getChessTable()[xCoordinate + 1][yCoordinate + 2]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate + 1;
            nextY = yCoordinate + 2;
          }
        }
      }
    }
    if ((xCoordinate + 2) >=0 && (xCoordinate + 2) <8) {
      if ((yCoordinate - 1) >= 0 && (yCoordinate - 1) < 8) {
        if (chessTable.getChessTable()[xCoordinate + 2][yCoordinate - 1] != 10){
          if (chessTable.getChessTable()[xCoordinate + 2][yCoordinate - 1]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate + 2;
            nextY = yCoordinate - 1;
          }
        }
      }
    }
    if ((xCoordinate + 2) >=0 && (xCoordinate + 2) <8) {
      if ((yCoordinate + 1) >= 0 && (yCoordinate + 1) < 8) {
        if (chessTable.getChessTable()[xCoordinate + 2][yCoordinate + 1] != 10){
          if (chessTable.getChessTable()[xCoordinate + 2][yCoordinate + 1]
                  < chessTable.getChessTable()[nextX][nextY]) {
            nextX = xCoordinate + 2;
            nextY = yCoordinate + 1;
          }
        }
      }
    }

  }

}
