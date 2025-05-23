package org.globant.java.university;

public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void showName() {
        System.out.println("Teacher name: " + super.getName());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
