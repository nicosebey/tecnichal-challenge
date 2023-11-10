package com.example.challenge.controller;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.challenge.controllers.MfrController;
import com.example.challenge.dto.MfrDto;
import com.example.challenge.mocks.MfrMockResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        @Tag("Positive")
        @DisplayName("Should return all manufacturers with country CHILE")
        public void givenOkRequest_whenAskForMfrByCountry_thenReturnOk() throws Exception{
            List<MfrDto> mockedResponse = MfrMockResponse.getAllMfrsByCountry();
            String country = "UNITED STATES (USA)";
            ResponseEntity<?> response = mfrController.getMfrByCountry("json", country);

            when(mfrService.getByCountry(eq("UNITED STATES (USA)"),eq("json")))
                    .thenReturn(mockedResponse);
            verify(mfrService, times(1)).getByCountry(country,"json");

            assertEquals(HttpStatus.OK, response.getStatusCode());

        }

        @Test
        @Tag("Positive")
        @DisplayName("Should return all manufacturers ")
        public void givenOkRequest_whenAskForAllMfr_thenReturnOk() throws Exception{
            List<MfrDto> mockedResponse = MfrMockResponse.getAllMfr();
            ResponseEntity<?> response = mfrController.getAllMfrs("json");
            when(mfrService.getMfrApi(anyString()))
                    .thenReturn(mockedResponse);
            when(mfrService.getMfrApi(anyString()))
                    .thenReturn(mockedResponse);
            verify(mfrService, times(1)).getMfrApi("json");
            assertEquals(HttpStatus.OK, response.getStatusCode());
        }
}
