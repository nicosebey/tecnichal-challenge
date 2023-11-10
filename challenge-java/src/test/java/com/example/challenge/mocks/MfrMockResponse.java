package com.example.challenge.mocks;

import com.example.challenge.dto.MfrDto;
import com.example.challenge.dto.VehiclesTypeDto;

import java.util.ArrayList;
import java.util.List;

public class MfrMockResponse {
    public static List<MfrDto> getAllMfr() {

        List<MfrDto> manufacturerDtos = new ArrayList<>();

        MfrDto mockManufacturer = new MfrDto();
        mockManufacturer.setCountry("UNITED STATES (USA)");
        mockManufacturer.setCommonName("FORD");
        mockManufacturer.setId(1);
        mockManufacturer.setName("FORD SIERRA");


        List<VehiclesTypeDto> vehicleTypes = new ArrayList<>();
        vehicleTypes.add(new VehiclesTypeDto(true, "HATCHBACK"));
        vehicleTypes.add(new VehiclesTypeDto(false, "SUB"));
        mockManufacturer.setVehicles(vehicleTypes);

        manufacturerDtos.add(mockManufacturer);
        return manufacturerDtos;
    }

    public static List<MfrDto> getAllMfrsByCountry() {

        List<MfrDto> mfrs = new ArrayList<>();

        MfrDto mockMfrs = new MfrDto();
        mockMfrs.setCountry("UNITED STATES (USA)");
        mockMfrs.setCommonName("TOYOTA");
        mockMfrs.setId(2);
        mockMfrs.setName("YARIS");
        List<VehiclesTypeDto> vehicleTypes = new ArrayList<>();
        vehicleTypes.add(new VehiclesTypeDto(true, "HATCHBACK"));
        vehicleTypes.add(new VehiclesTypeDto(false, "SUB"));
        vehicleTypes.add(new VehiclesTypeDto(false, "WEEKEND"));

        mockMfrs.setVehicles(vehicleTypes);

        mfrs.add(mockMfrs);
        return mfrs;
    }
}
