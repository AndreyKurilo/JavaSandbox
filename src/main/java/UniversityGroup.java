import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UniversityGroup {
  public List<String> students = new ArrayList<>();

  public UniversityGroup() {
    students.add("Сергей Фрединский");
    students.add("Виталий Правдивый");
    students.add("Максим Козыменко");
    students.add("Наталия Андрющенко");
    students.add("Ира Величенко");
    students.add("Николай Соболев");
    students.add("Снежана Слободенюк");
  }

  public void exclude(String studentToExclude)
  {
    if(students.contains(studentToExclude))
      students.remove(studentToExclude);
  }

  public void excludeLoop(String studentToExclude) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).equals(studentToExclude)) {
        students.remove(i);
      }
    }
  }

  public void exclude(String excludedStudent, String excludedStudent1) {
    List<String> studentsCopy = new ArrayList<>(students);
    for (String student : studentsCopy) {
      if (student.equals(excludedStudent1)) {
        students.remove(student);
      }
    }
    students.removeIf(x->x.equals(excludedStudent));
    /*for (int i = 0; i < students.size(); i++) {
      if (students.get(i).equals(excludedStudent1)) {
        students.remove(i);
      }
    }*/
  }

  public static void main(String[] args) {
    System.out.println("Programm starts");
    UniversityGroup universityGroup = new UniversityGroup();
    //universityGroup.exclude("Виталий Правдивый");
    //universityGroup.excludeLoop("Виталий Правдивый");
    universityGroup.exclude("Виталий Правдивый", "Наталия Андрющенко");
    universityGroup.students.forEach(System.out::println);
  }

}
