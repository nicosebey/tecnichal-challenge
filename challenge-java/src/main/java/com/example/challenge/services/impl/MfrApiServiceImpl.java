package com.example.challenge.services.impl;

import com.example.challenge.dto.MfrDto;
import com.example.challenge.model.Singleton;
import com.example.challenge.services.MfrApiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MfrApiServiceImpl implements MfrApiService {


    @Override
    public List<MfrDto> getMfrApi(String format) {

        return Singleton.getInstance(format).getManufacturers();
    }
    @Override
    public List<MfrDto> getByCountry(String country,String format) {
        return  Singleton.getInstance(format).getManufacturers().stream().filter(mfr -> mfr.getCountry().equals(country)).collect(Collectors.toList());
    }

    @Override
    public List<MfrDto> getMfrsByVehicleName(String name,String format) {
        return Singleton.getInstance(format).getManufacturers().stream().filter(mfr -> !mfr.getVehicles().stream().filter(v -> v.getName().equals(name)).findAny().isEmpty()).collect(Collectors.toList());
    };
}
