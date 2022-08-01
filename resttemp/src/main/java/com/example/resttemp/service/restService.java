package com.example.resttemp.service;

import com.example.resttemp.model.appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class restService {

    private RestTemplate restTemplate;

    @Autowired
    public restService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public String saveAppointment(appointment appoint){
        HttpEntity<appointment> entity = new HttpEntity<>(appoint);

        return restTemplate.exchange("http://localhost:5000/appointment", HttpMethod.POST, null, String.class).getBody();
    }

    public List<appointment> getAppoint(String username){
        return restTemplate.exchange("http://localhost:5000/appointment/"+username, HttpMethod.GET, null, List.class).getBody();
    }
}
