package service;

import data.Student;
import data.Teacher;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> usersStudents = new ArrayList<User>();
    private List<User> usersTeachers = new ArrayList<User>();

    public void createUser(User user, String type){
        if (user instanceof Student){
            usersStudents.add(new Student(user.getUserName(), user.getAge(), type ));
        }
        else{
            usersTeachers.add(new Teacher(user.getUserName(), user.getAge(), type));


        }
    }
    public List<User> read(String type){
        if (type.equals("student")){
            return usersStudents;
        }else if (type.equals("teacher")){
            return usersTeachers;
        }
        System.out.println("не найдено");
        return null;
    }
}
