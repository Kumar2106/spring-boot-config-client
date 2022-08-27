package com.example.configurable_spring_values.controller;

import com.example.configurable_spring_values.service.ConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultSecret {

    @Autowired
    private ConstantService constantService;

    @GetMapping("/name")
    public ResponseEntity<String>  getValues(){
        return new ResponseEntity(constantService.getName(), HttpStatus.OK);
    }
}
