package com.example.challenge.services;

import com.example.challenge.dto.MfrDto;

import java.util.List;

public interface MfrApiService {


    List<MfrDto> getMfrApi(String format);

    List<MfrDto> getByCountry(String country, String format);

    List<MfrDto> getMfrsByVehicleName(String name, String format);
}
