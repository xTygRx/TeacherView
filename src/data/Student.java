package data;

public class Student extends User{
    private String directions;

    public Student(String userName, int age, String directions) {
        super(userName, age);
        this.directions = directions;
    }

    public Student() {

    }

    public String getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Student{ \n" +
                "directions='" + directions + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                "} \n";
    }
}
