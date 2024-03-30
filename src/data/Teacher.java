package data;

public class Teacher extends User{
    private String discipline;

    public Teacher(){

    }

    public Teacher(String userName, int age, String discipline) {
        super(userName, age);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "Teacher{ \n" +
                "discipline='" + discipline + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                "}\n";
    }
}
