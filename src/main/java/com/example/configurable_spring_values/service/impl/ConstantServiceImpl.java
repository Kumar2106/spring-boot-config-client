package com.example.configurable_spring_values.service.impl;

import com.example.configurable_spring_values.constant.ExperimentConstant;
import com.example.configurable_spring_values.service.ConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstantServiceImpl implements ConstantService {

    @Autowired
    private ExperimentConstant experimentConstant;

    @Override
    public String getName() {
        return experimentConstant.getName();
    }
}
