package com.TAUchapters.chapter_9a_Inheritance;

public class Person {
    private String name;
    private int age;
    private String Gender;
    private String reasons;

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public Person(){
        System.out.println("I am the Person Constructor");
    }

    public Person(String reasons){
        System.out.println("Iam 2nd Construtor . You call me from the subclass Employee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
