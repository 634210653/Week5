package com.example.demo.model;

/**
 * @Author: LP
 * @Date: 2019/4/26
 */
public class Employee {

    private  int id = 0;
    private  String  name;
    private  int age = 0;
    private  String gender;

    public Employee(int id, String name, int age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public boolean equals(Object obj) {

        if(obj == null || !(obj instanceof  Employee))
            return false;

        if(this.id == ((Employee)obj).id)
            return  true;

        return  false;
    }

    //getter and setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
