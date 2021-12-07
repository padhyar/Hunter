package com.sabih.hunta.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName;

    public Application(String companyName){
        this.companyName = companyName;
    }

    public Application() {
        
    }
}
