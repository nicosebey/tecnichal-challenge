package services;

import dto.MfrDto;

import java.util.List;

public interface MfrApiService {
    List<MfrDto> getMfrApi(String format);
}
