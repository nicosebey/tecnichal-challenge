package services.impl;

import dto.MfrDto;
import model.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import services.MfrApiService;

import java.util.List;

public class MfrApiServiceImpl implements MfrApiService {


    @Override
    public List<MfrDto> getMfrApi(String format) {

        return Singleton.getInstance(format).getManufacturers();
    }
}
