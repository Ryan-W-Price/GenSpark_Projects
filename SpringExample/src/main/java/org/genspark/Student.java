package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {

    @Autowired
    private int id;
    private String name;
    private List<Phone> phone;
    private Address add;

    public Student() {
    }

    public Student(int id, String name, List<Phone> phone, Address add) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.add = add;
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

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", add=" + add +
                '}';
    }
}
