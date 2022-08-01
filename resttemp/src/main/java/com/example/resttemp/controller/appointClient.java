package com.example.resttemp.controller;

import com.example.resttemp.model.appointment;
import com.example.resttemp.service.restService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class appointClient {

    @Autowired
    private restService rest;

    @PostMapping("/info/post")
    public String saveAppoint(@RequestBody appointment appoint){
        return rest.saveAppointment(appoint);
    }
    @GetMapping("/info/get")
    public List<appointment> getAppointments(@RequestBody String username){
        return rest.getAppoint(username);
    }
}
