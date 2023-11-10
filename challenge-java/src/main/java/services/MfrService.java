package services;

import dto.MfrDto;
import model.Mfr;
import model.Singleton;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class MfrService {


    public List<MfrDto> findAll(String format) {
        List<MfrDto> manufacturers = new ArrayList<>();
        return manufacturers;
    }
}
