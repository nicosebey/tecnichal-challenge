package dto;


import java.util.List;

public class MfrDto {
    private Integer id;
    private String country;
    private String commonName;
    private String name;

    private List<VehiclesTypeDto> vehicles;

    public void setVehicles(List<VehiclesTypeDto> vehicles){
        this.vehicles = vehicles;
    }

    public List<VehiclesTypeDto> getVehicles(){
        return this.vehicles;
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
