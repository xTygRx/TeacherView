import data.Student;
import data.Teacher;
import view.StudentView;
import view.TeacherView;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Афанасий", 20, "философия");
        Student stud2 = new Student("Николя", 21, "технический");
        Student stud3 = new Student("Прохор", 32, "право");
        Student stud4 = new Student("Инокентий", 20, "типизация");
        Student stud5 = new Student("Георгий", 25, "философия");
        Student stud6 = new Student("Петр", 27, "право");

        StudentView studentView = new StudentView();

        studentView.creatStudent(stud1);
        studentView.creatStudent(stud2);
        studentView.creatStudent(stud3);
        studentView.creatStudent(stud4);
        studentView.creatStudent(stud5);
        studentView.creatStudent(stud6);

        studentView.readStudent();

        Teacher teacher1 = new Teacher("Николай Иванович", 45, "Философия");
        Teacher teacher2 = new Teacher("Прокофий Сидорович", 35, "Право");
        Teacher teacher3 = new Teacher("Никифор Фарфорович", 56, "История");
        Teacher teacher4 = new Teacher("Анна Простова", 49, "Русский язык");
        Teacher teacher5 = new Teacher("Ирина Домодедова", 35, "Дизайн");
        Teacher teacher6 = new Teacher("Петр Васильевич", 45, "Философия");

        TeacherView teacherView = new TeacherView();

        teacherView.creatTeacher(teacher1);
        teacherView.creatTeacher(teacher2);
        teacherView.creatTeacher(teacher3);
        teacherView.creatTeacher(teacher4);
        teacherView.creatTeacher(teacher5);
        teacherView.creatTeacher(teacher6);

        teacherView.readTeacher();



    }
}