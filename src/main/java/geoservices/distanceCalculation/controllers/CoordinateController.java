package geoservices.distanceCalculation.controllers;


import geoservices.distanceCalculation.DistanceCalc;
import geoservices.distanceCalculation.Model.Line;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoordinateController {
    @CrossOrigin(origins = "http://localhost:3001")
@RequestMapping(value = "/coord", method = RequestMethod.POST)
public ResponseEntity<Double> update(@RequestBody Line line){

        Double distance = DistanceCalc.distanceIs(line);
        return new ResponseEntity<Double>(distance, HttpStatus.OK);
        }
}

