package com.traini8.Traini8.controllers;

import com.traini8.Traini8.dtos.TrainingCenterDto;
import com.traini8.Traini8.services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1")
public class TrainingCenterController {

    @Autowired
    TrainingCenterService trainingCenterService;


    //Endpoint to store Training Centers data
    @PostMapping("/create")
    public ResponseEntity<TrainingCenterDto> create(@Valid @RequestBody TrainingCenterDto trainingCenterDto)
    {
        TrainingCenterDto savedTrainingCentreDto= trainingCenterService.create(trainingCenterDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTrainingCentreDto);
    }

    //Endpoint to obtain all the data regarding Training centers from database
    @GetMapping("/fetch")
    public ResponseEntity<List<TrainingCenterDto>> fetchAll()
    {
        List<TrainingCenterDto> trainingCenterDtos = trainingCenterService.fetchAll();

        return ResponseEntity.status(HttpStatus.OK).body(trainingCenterDtos);
    }


    //Endpoint to obtain data of particular Training center using centerCode
    @GetMapping("/fetch/code/{centerCode}")
    public ResponseEntity<TrainingCenterDto> fetchWithCenterCode(@Valid @PathVariable String centerCode)
    {
        TrainingCenterDto trainingCenterDto=trainingCenterService.fetchUsingCenterCode(centerCode);

        return  ResponseEntity.status(HttpStatus.OK).body(trainingCenterDto);
    }

    //Endpoint to obtain data of particular Training center using centerName
    @GetMapping("/fetch/name/{centerName}")
    public ResponseEntity<TrainingCenterDto> fetchWithCenterName(@Valid @PathVariable String centerName)
    {
        TrainingCenterDto trainingCenterDto=trainingCenterService.fetchUsingCenterName(centerName);

        return  ResponseEntity.status(HttpStatus.OK).body(trainingCenterDto);
    }


}
