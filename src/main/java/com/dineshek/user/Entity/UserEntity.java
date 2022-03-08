package com.dineshek.user.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name="USER_TABLE")
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
    private Integer salary;

    public UserEntity(int id, String name, String dept, String gender, Date time) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.gender = gender;
        this.time = time;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private String gender;
    private Date time;

}