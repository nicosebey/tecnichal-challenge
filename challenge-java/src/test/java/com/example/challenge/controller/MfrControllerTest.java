package com.example.challenge.controller;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;


import com.example.challenge.controllers.MfrController;
import com.example.challenge.dto.MfrDto;
import com.example.challenge.mocks.MfrMockResponse;
import com.example.challenge.services.MfrApiService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.List;


@WebMvcTest(MfrControllerTest.class)
    public class MfrControllerTest {

        @Mock
        private MfrApiService mfrService;

        @InjectMocks
        private MfrController mfrController;

        @Test
        public void testGetByCountry() throws Exception{
            List<MfrDto> mockedResponse = MfrMockResponse.getAllMfrsByCountry();
            String country = "CHILE";
            when(mfrService.getByCountry(anyString(),eq("CHILE")))
                    .thenReturn(mockedResponse);
        }

        @Test
        public void testFindAll() throws Exception{
            List<MfrDto> mockedResponse = MfrMockResponse.getAllMfr();
            when(mfrService.getMfrApi(anyString()))
                    .thenReturn(mockedResponse);
        }



}
