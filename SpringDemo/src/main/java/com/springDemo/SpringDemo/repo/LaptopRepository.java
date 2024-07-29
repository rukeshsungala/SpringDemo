package com.springDemo.SpringDemo.repo;

import com.springDemo.SpringDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("saved in db...");
    }
}
