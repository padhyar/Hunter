package com.sabih.hunta;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String companyName;

    public Application(String companyName){
        this.companyName = companyName;
    }
    public Application(){

    }
    public String getCompanyName(){
        return this.companyName;
    }
}
