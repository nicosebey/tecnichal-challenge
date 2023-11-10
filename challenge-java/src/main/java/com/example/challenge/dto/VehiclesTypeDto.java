package com.example.challenge.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class VehiclesTypeDto {
    @JsonProperty("IsPrimary")
    private boolean isPrimary;
    @JsonProperty("Name")
    private String name;
    private Integer id;
    public  VehiclesTypeDto(Boolean isPrimary, String name){
        super();
        this.isPrimary = isPrimary;
        this.name = name;
    }
    public VehiclesTypeDto() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public boolean isPrimary() {
        return isPrimary;
    }
}
