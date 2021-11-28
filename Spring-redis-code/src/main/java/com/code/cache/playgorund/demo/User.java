package com.code.cache.playgorund.demo;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private String id;
    private String name;
    private Long Salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(Salary, user.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Salary);
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Long getSalary() {
        return Salary;
    }

    public User setSalary(Long salary) {
        Salary = salary;
        return this;
    }

    public User(String id, String name, Long salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
