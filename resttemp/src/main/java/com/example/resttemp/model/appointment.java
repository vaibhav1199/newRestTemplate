package com.example.resttemp.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class appointment {
    private int id;
    private String patientname;
    private String name;
    private String time;
    private String duration;
    private String doctorname;
    private String venue;
    private int zipcode;
}
