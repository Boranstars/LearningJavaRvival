package com.boranstars.collection.set;

import java.util.Objects;

public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private int id;

    public Students(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && id == students.id && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }


    @Override
    public int compareTo(Students o) {

        if(o == null) {
            return 1;
        }

        if(this.id < o.id) {
            return -1;
        }  else if(this.id > o.id) {
            return 1;
        }

        return 0;
    }
}
