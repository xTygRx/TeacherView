package view;

import controller.Controller;
import data.Student;

public class StudentView {
    private Controller controller = new Controller();

    public void creatStudent(Student student){
        controller.createUser(student, student.getDirections());
        System.out.println("Студент создан!");
    }

    public void readStudent(){
        System.out.println("Список студентов");
        controller.read("student");
    }
}
