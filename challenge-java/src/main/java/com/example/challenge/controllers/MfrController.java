package com.example.challenge.controllers;
import com.example.challenge.services.MfrApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getMfr")
public class MfrController {


        @Autowired
        private MfrApiService manufacturers;

    private static final Logger logger = LoggerFactory.getLogger(MfrController.class);

        @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
        @ResponseBody
        @ResponseStatus(HttpStatus.OK)
        public ResponseEntity<Object> getAllMfrs(@RequestParam(value = "format", required = true) String format) {
            try {
                return new ResponseEntity<>(manufacturers.getMfrApi(format), HttpStatus.OK);
            } catch(Exception e) {
                logger.error(e.getMessage());
                return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    @GetMapping(value = "/country",produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getMfrByCountry(@RequestParam(value = "format", required = true) String format,@RequestParam String country) {
        try {
            return new ResponseEntity<>(manufacturers.getByCountry(country,format), HttpStatus.OK);
        } catch(Exception e) {
            logger.error(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/vehicleName",produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getMfrsByVehicleName(@RequestParam(value = "format", required = true) String format,@RequestParam String name) {
        try {
            return new ResponseEntity<>(manufacturers.getMfrsByVehicleName(name,format), HttpStatus.OK);
        } catch(Exception e) {
            logger.error(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
