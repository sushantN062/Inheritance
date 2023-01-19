package model;

import java.util.ArrayList;

public class Children extends Parent{

    public Children(String name, String grades, int age, ArrayList<Hobby> hobbies) {
        this.name = name;
        this.grades = grades;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    String name;
    String grades;
    int age;
    ArrayList<Hobby> hobbies;


    public String getFullName() {
        String fullName = "My name is " + this.name + " "  + this.family_name;
        return fullName;
    }

    public void getHobby() {
        ArrayList<Hobby> hobby = this.hobbies;
        for (Hobby singleHobby: hobby) {
            System.out.println("\tHobby is: "+ singleHobby.getName());
        }

        System.out.println("I live in " + this.house_address + "!");
    }
}
