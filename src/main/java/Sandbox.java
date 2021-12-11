public class Sandbox {

  public void action(int a) {
    a+=8;
    System.out.println("a in action = " + a);
    int b = a >> 1;
    System.out.println("Сдвиг на 1 разряд 2ки a >> 1 in action = " + b);
  }

  public static void main(String[] args) {
    Sandbox obj = new Sandbox();
    int a = 6;
    obj.action(a);

    System.out.println("a from main = " + a);
    int c = 3;
    int b = a << c;

    System.out.println("Сдвиг на "  + c + " разряда 2ки a << " + c + " in main = " + b);
  }
}
