package Exercises;

public class GetSysEnvironment {
  public static void main(String[] args) {

    System.out.println("\nCurrent system environment:");
    String strEnv = System.getenv().toString();
    String[] wordsEnv = strEnv.split(" ");
    int i = 0;
    for (String word : wordsEnv) {
      i++;
      if (i%4 != 0){
        System.out.print(word);
        } else {
        System.out.println();
      }
    }

    System.out.println("\n\nCurrent system properties:");
    strEnv = System.getProperties().toString();
    String[] wordsProperties = strEnv.split(" ");
    i = 0;
    for (String word : wordsProperties) {
      i++;
      if (i%4 != 0){
        System.out.print(word);
      } else {
        System.out.println();
      }
    }
  }
}
