package com.sabih.hunta.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String jobrole;
    private String location;
    private String salary;
    @OneToOne(mappedBy = "description")
    private Application application;


    public Description(String jobrole, String location, String salary) {
        this.jobrole = jobrole;
        this.location = location;
        this.salary = salary;
    }
}
