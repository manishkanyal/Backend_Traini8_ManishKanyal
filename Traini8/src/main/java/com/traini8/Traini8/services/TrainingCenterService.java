package com.traini8.Traini8.services;

import com.traini8.Traini8.dtos.TrainingCenterDto;
import com.traini8.Traini8.entities.TrainingCenter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TrainingCenterService {

    TrainingCenterDto create(TrainingCenterDto trainingCenterDto);
    List<TrainingCenterDto> fetchAll();

    TrainingCenterDto fetchUsingCenterCode(String centerCode);

    TrainingCenterDto fetchUsingCenterName(String centerName);

}
