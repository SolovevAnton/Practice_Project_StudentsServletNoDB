package com.solovev.model;

import java.util.Objects;
import java.util.function.ToIntFunction;

public class Student implements IdHolder {
    private int id = 1; //id starts from 1
    private String name;
    private int age;
    private long num;
    private int salary;

    public Student() {
    }

    public Student(int id, String name, int age, long num, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.num = num;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * NOTE: ID does not included in equals, since it computes out of the object
     *
     * @param o object to compare
     * @return true if objects are logically equal (EXCEPT ID FIELD) false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && num == student.num && salary == student.salary && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, num, salary);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                ", salary=" + salary +
                '}';
    }
}
