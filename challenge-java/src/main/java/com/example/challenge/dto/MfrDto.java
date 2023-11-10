package com.example.challenge.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MfrDto {
    @JsonProperty("Mfr_ID")
    private Integer id;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Mfr_CommonName")
    private String commonName;
    @JsonProperty("Mfr_Name")
    private String name;
    @JsonProperty("VehicleTypes")
    private List<VehiclesTypeDto> vehicles;

    public void setVehicles(List<VehiclesTypeDto> vehicles){
        this.vehicles = vehicles;
    }

    public List<VehiclesTypeDto> getVehicles(){
        return vehicles;
    }

    public Integer getId() {
        return id;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
