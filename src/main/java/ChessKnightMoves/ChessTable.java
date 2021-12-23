package ChessKnightMoves;

import java.sql.Array;
import java.util.Arrays;

public class ChessTable {

  public int[][] getChessTable() {
    return chessTable;
  }

  int [][] chessTable;
  VerticalRow verticalRowNaming;

  public ChessTable(int[][] chessTable) {
    this.chessTable = chessTable;
  }

  public ChessTable() {
    this.chessTable = new int[][]{{2, 3, 4, 4, 4, 4, 3, 2}, {3, 4, 6, 6, 6, 6, 4, 3}, {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4}, {4, 6, 8, 8, 8, 8, 6, 4}, {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3}, {2, 3, 4, 4, 4, 4, 3, 2}};
  }

  public void printChessTable(){
    System.out.println();
    for (int i = 0; i < 8; i++) {
      System.out.print(" " + (8 - i) + " | ");
      for (int j = 0; j < 8; j++) {
        System.out.print(" ");
        if (chessTable[j][i] == 10){
          System.out.println("X");
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

  public void changeCellsAfterMove(int xCoordinate, int yCoordinate){
    chessTable[xCoordinate][yCoordinate] = 10;
    int nextX = xCoordinate;
    int nextY = yCoordinate;

    if ((nextX - 1) >=0 && (nextX - 1) <8) {
      if ((nextY - 2) >= 0 && (nextY - 2) < 8) {
        if (chessTable[nextX - 1][nextY - 2] != 10)
          chessTable[nextX - 1][nextY - 2] = chessTable[nextX - 1][nextY - 2]--;
      }
    }
    if ((nextX - 1) >=0 && (nextX - 1) <8) {
      if ((nextY + 2) >= 0 && (nextY + 2) < 8) {
        if (chessTable[nextX - 1][nextY + 2] != 10)
          chessTable[nextX - 1][nextY + 2] = chessTable[nextX - 1][nextY + 2]--;
      }
    }
    if ((nextX - 2) >=0 && (nextX - 2) <8) {
      if ((nextY - 1) >= 0 && (nextY - 1) < 8) {
        if (chessTable[nextX - 2][nextY - 1] != 10)
          chessTable[nextX - 2][nextY - 1] = chessTable[nextX - 2][nextY - 1]--;
      }
    }
    if ((nextX - 2) >=0 && (nextX - 2) <8) {
      if ((nextY + 1) >= 0 && (nextY + 1) < 8) {
        if (chessTable[nextX - 2][nextY + 1] != 10)
          chessTable[nextX - 2][nextY + 1] = chessTable[nextX - 2][nextY + 1]--;
      }
    }
    if ((nextX + 1) >=0 && (nextX + 1) <8) {
      if ((nextY - 2) >= 0 && (nextY - 2) < 8) {
        if (chessTable[nextX + 1][nextY - 2] != 10)
          chessTable[nextX + 1][nextY - 2] = chessTable[nextX + 1][nextY - 2]--;
      }
    }
    if ((nextX + 1) >=0 && (nextX + 1) <8) {
      if ((nextY + 2) >= 0 && (nextY + 2) < 8) {
        if (chessTable[nextX + 1][nextY + 2] != 10)
          chessTable[nextX + 1][nextY + 2] = chessTable[nextX + 1][nextY + 2]--;
      }
    }
    if ((nextX + 2) >=0 && (nextX + 2) <8) {
      if ((nextY - 1) >= 0 && (nextY - 1) < 8) {
        if (chessTable[nextX + 2][nextY - 1] != 10)
          chessTable[nextX + 2][nextY - 1] = chessTable[nextX + 2][nextY - 1]--;
      }
    }
    if ((nextX + 2) >=0 && (nextX + 2) <8) {
      if ((nextY + 1) >= 0 && (nextY + 1) < 8) {
        if (chessTable[nextX + 2][nextY + 1] != 10)
          chessTable[nextX + 2][nextY + 1] = chessTable[nextX + 2][nextY + 1]--;
      }
    }

  }

  enum VerticalRow {A, B, C, D, E, F, G, H}

}
