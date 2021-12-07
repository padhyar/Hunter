package com.sabih.hunta.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Entity
@Data
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String jobrole;
    private String location;
    private String salary;


    public Description() {

    }

    public Description(String jobrole, String location, String salary) {
        this.jobrole = jobrole;
        this.location = location;
        this.salary = salary;
    }
}
