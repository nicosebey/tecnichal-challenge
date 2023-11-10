package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.ApiResponseDto;
import dto.MfrDto;
import org.springframework.http.ResponseEntity;
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
            ResponseEntity<ApiResponseDto> response = restTemplate.getForEntity(url + format, ApiResponseDto.class);
            INSTANCE.setManufacturers(response.getBody().getResults());
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
