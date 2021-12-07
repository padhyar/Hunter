package com.sabih.hunta.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName;
    @OneToOne
    private  Description description;

    public Application(String companyName, Description description){
        this.companyName = companyName;
        this.description = description;
    }

    public Application() {

    }
}
