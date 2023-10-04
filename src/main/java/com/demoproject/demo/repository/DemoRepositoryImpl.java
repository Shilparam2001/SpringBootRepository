package com.demoproject.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepositoryImpl implements DemoRepository{

    @Override
    public String getString() {
        return "I am from repository layer";
    }
}
