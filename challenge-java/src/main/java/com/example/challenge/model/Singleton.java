package com.example.challenge.model;

import com.example.challenge.dto.MfrDto;
import com.example.challenge.dto.ApiResponseDto;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class Singleton {

    private static final String url = "https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=";
    private static  List<MfrDto> manufacturers;

    private static Singleton INSTANCE;


    public static synchronized Singleton getInstance(String format){
        if(manufacturers == null ) {
            INSTANCE = new Singleton();
            RestTemplate restTemplate = new RestTemplate();
            ApiResponseDto response = restTemplate.getForObject(url + format, ApiResponseDto.class);
            INSTANCE.setManufacturers(response.getResults());
            //INSTANCE.setManufacturers(INSTANCE);
        }
        return INSTANCE;
    }

    public List<MfrDto> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<MfrDto> manufacturers) {
        Singleton.manufacturers = manufacturers;
    }
}
