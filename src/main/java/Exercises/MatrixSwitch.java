package Exercises;

import java.util.Scanner;

public class MatrixSwitch {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите кол-во строк:");
    int n = scanner.nextInt();
    System.out.println("Введите кол-во столбцов:");
    int m = scanner.nextInt();

    int[][] matrixBefore = new int[n][m];

    System.out.println("Matrix before:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrixBefore[i][j] = (i + 1) << (j + 1);
        System.out.print(matrixBefore[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Matrix after");
    int[][] matrixAfter = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrixAfter[i][j] = matrixBefore[n - 1 - j][m - 1 -i];
        System.out.print(matrixAfter[i][j] + " ");
      }
      System.out.println();
    }
  }
}
