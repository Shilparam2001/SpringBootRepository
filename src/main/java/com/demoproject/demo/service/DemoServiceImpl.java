package com.demoproject.demo.service;

import com.demoproject.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoRepository demoRepository;
    @Override
    public String getString() {
        return demoRepository.getString();

    }
}
