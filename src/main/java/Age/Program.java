package Age;

public class Program {

  Input input = new Input();

  public void start() {
    String name = input.getName();
    String surname = input.getSurname();
    int birthYear = input.getBirthYear();
    int birthMonth = input.getBirthMonth();
    int birthDay = input.getBirthDay();

    Person person = new Person(name, surname, birthYear, birthMonth, birthDay);

    person.printAge();
  }
}