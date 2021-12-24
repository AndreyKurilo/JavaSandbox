package ChessKnightMoves;

public class ChessTable {

  int[][] chessTable;
  char x;
  char y;

  public char getX(int xValue) {
    switch (xValue) {
      case 0:
        x = 'A';
        break;
      case 1:
        x = 'B';
        break;
      case 2:
        x = 'C';
        break;
      case 3:
        x = 'D';
        break;
      case 4:
        x = 'E';
        break;
      case 5:
        x = 'F';
        break;
      case 6:
        x = 'G';
        break;
      case 7:
        x = 'H';
        break;
    }
    return x;
  }

  public void setX(char x) {
    this.x = x;
  }

  public char getY(int yValue) {
    switch (yValue) {
      case 0:
        y = '8';
        break;
      case 1:
        y = '7';
        break;
      case 2:
        y = '6';
        break;
      case 3:
        y = '5';
        break;
      case 4:
        y = '4';
        break;
      case 5:
        y = '3';
        break;
      case 6:
        y = '2';
        break;
      case 7:
        y = '1';
        break;
    }
    return y;
  }

  public void setY(char y) {
    this.y = y;
  }

  public ChessTable(int[][] chessTable) {
    this.chessTable = chessTable;
  }

  public ChessTable() {
    this.chessTable = new int[][]{{2, 3, 4, 4, 4, 4, 3, 2}, {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4}, {4, 6, 8, 8, 8, 8, 6, 4}, {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4}, {3, 4, 6, 6, 6, 6, 4, 3}, {2, 3, 4, 4, 4, 4, 3, 2}};
  }

  public int[][] getChessTable() {
    return chessTable;
  }

  public void printChessTable() {
    System.out.println();
    for (int i = 0; i < 8; i++) {
      System.out.print(" " + (8 - i) + " | ");
      for (int j = 0; j < 8; j++) {
        System.out.print(" ");
        if (chessTable[j][i] == 9) {
          System.out.print("X");
        } else {
          System.out.print(chessTable[j][i]);
        }
        System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("   __________________________");
    System.out.println("      A  B  C  D  E  F  G  H");
  }

  public void changeCellsAfterMove(int xCoordinate, int yCoordinate) {
    chessTable[xCoordinate][yCoordinate] = 9;

    if ((xCoordinate - 1) >= 0 && (xCoordinate - 1) < 8) {
      if ((yCoordinate - 2) >= 0 && (yCoordinate - 2) < 8) {
        if (chessTable[xCoordinate - 1][yCoordinate - 2] != 9)
          chessTable[xCoordinate - 1][yCoordinate - 2] = chessTable[xCoordinate - 1][yCoordinate - 2] - 1;
      }
    }
    if ((xCoordinate - 1) >= 0 && (xCoordinate - 1) < 8) {
      if ((yCoordinate + 2) >= 0 && (yCoordinate + 2) < 8) {
        if (chessTable[xCoordinate - 1][yCoordinate + 2] != 9)
          chessTable[xCoordinate - 1][yCoordinate + 2] = chessTable[xCoordinate - 1][yCoordinate + 2] - 1;
      }
    }
    if ((xCoordinate - 2) >= 0 && (xCoordinate - 2) < 8) {
      if ((yCoordinate - 1) >= 0 && (yCoordinate - 1) < 8) {
        if (chessTable[xCoordinate - 2][yCoordinate - 1] != 9)
          chessTable[xCoordinate - 2][yCoordinate - 1] = chessTable[xCoordinate - 2][yCoordinate - 1] - 1;
      }
    }
    if ((xCoordinate - 2) >= 0 && (xCoordinate - 2) < 8) {
      if ((yCoordinate + 1) >= 0 && (yCoordinate + 1) < 8) {
        if (chessTable[xCoordinate - 2][yCoordinate + 1] != 9)
          chessTable[xCoordinate - 2][yCoordinate + 1] = chessTable[xCoordinate - 2][yCoordinate + 1] - 1;
      }
    }
    if ((xCoordinate + 1) >= 0 && (xCoordinate + 1) < 8) {
      if ((yCoordinate - 2) >= 0 && (yCoordinate - 2) < 8) {
        if (chessTable[xCoordinate + 1][yCoordinate - 2] != 9)
          chessTable[xCoordinate + 1][yCoordinate - 2] = chessTable[xCoordinate + 1][yCoordinate - 2] - 1;
      }
    }
    if ((xCoordinate + 1) >= 0 && (xCoordinate + 1) < 8) {
      if ((yCoordinate + 2) >= 0 && (yCoordinate + 2) < 8) {
        if (chessTable[xCoordinate + 1][yCoordinate + 2] != 9)
          chessTable[xCoordinate + 1][yCoordinate + 2] = chessTable[xCoordinate + 1][yCoordinate + 2] - 1;
      }
    }
    if ((xCoordinate + 2) >= 0 && (xCoordinate + 2) < 8) {
      if ((yCoordinate - 1) >= 0 && (yCoordinate - 1) < 8) {
        if (chessTable[xCoordinate + 2][yCoordinate - 1] != 9)
          chessTable[xCoordinate + 2][yCoordinate - 1] = chessTable[xCoordinate + 2][yCoordinate - 1] - 1;
      }
    }
    if ((xCoordinate + 2) >= 0 && (xCoordinate + 2) < 8) {
      if ((yCoordinate + 1) >= 0 && (yCoordinate + 1) < 8) {
        if (chessTable[xCoordinate + 2][yCoordinate + 1] != 9)
          chessTable[xCoordinate + 2][yCoordinate + 1] = chessTable[xCoordinate + 2][yCoordinate + 1] - 1;
      }
    }
  }
}
