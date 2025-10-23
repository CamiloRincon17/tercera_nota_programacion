package unidad2.clase;

public class Student {
    public String name;
    public double grade;
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public double highestGrade(){

       
        return grade;
    }

    public void ShowInfo(){
        System.out.println(this.name);
    }
}
