package com.dmswide.entity;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public String gender;

    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", email='" + email + '\'' +
            '}';
    }
}
