package com.TAUchapters.chapter_9a_Inheritance;

public class Employee extends Person{
    private String employeeId;
    private String title;

    public Employee(){
        super("German");
        System.out.println("I am the employee constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
