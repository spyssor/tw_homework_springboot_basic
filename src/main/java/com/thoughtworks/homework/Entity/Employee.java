package com.thoughtworks.homework.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private String gender;
}
