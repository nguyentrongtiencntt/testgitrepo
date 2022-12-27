package iuh;

import java.util.ArrayList;

public class Student {

    private  int id;
    private String name;
    private int yob;
    private String address;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public Student() {
        System.out.println("Constructor!");
    }

    public Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int yob, String address) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.address = address;
    }
    public Student(String name,int id, int yob, String address) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
