package controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.MfrService;

@RestController
@RequestMapping(value = "manufacturers")
public class MfrController {


        @Autowired
        private MfrService manufacturers;

        @GetMapping()
        @ResponseBody
        public ResponseEntity<Object> getAllMfrs(@RequestParam(value = "format") String format) {
            try {
                return new ResponseEntity<>(manufacturers.findAll(format), HttpStatus.OK);
            } catch(Exception e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

}
