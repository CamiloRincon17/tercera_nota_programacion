package weekunknown;

import java.util.ArrayList;
import java.util.List;

import weekunknown.clase.Student;
import weekunknown.clase.Employee;

public class App {
    public static void main(String[] args) {
    Student Student1 = new Student("camilo", 5);
    Student Student2 = new Student("moli", 3);

        System.out.println();
    ArrayList <Student> students = new ArrayList<>();
    students.add(new Student("maria",3));
    students.add(new Student("molinae", 8));

    for (Student student : students) {
        System.out.println(student.name);
    }

    Employee Roles = new Employee("Manager");
    System.out.println(Roles.showRespinsabilites);
}
}
