package org.globant.java.university;

public class Teacher extends Person implements CalculateSalary {
    private final float salary = 15000.0f;
    private int yearsOfExperience;
    private float hours;
    private boolean isPartTime;

    public Teacher(String name, int age, boolean isPartTime, float hours) {
        super(name, age);
    }

    public Teacher(String name, int age, boolean isPartTime, int yearsOfExperience) {
        super(name, age);
    }

    @Override
    public float calculateSalary(float hours) {
        return salary * hours;
    }

    @Override
    public float calculateSalary(int yearsOfExperience) {
        return salary + (yearsOfExperience * 1.1f);
    }

    public void showName() {
        System.out.println("Teacher name: " + super.getName());
    }

    public void changeName(String name) {
        super.setName(name);
    }

    public float getBaseSalary() {
        if(isPartTime) {
            return calculateSalary(hours);
        }
        else
        {
            return calculateSalary(yearsOfExperience);
        }
    }

    public void showNameAndAge() {
        System.out.println("Teacher name: " + super.getName() + ", age: " + super.getAge());
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
