package com.traini8.Traini8.repository;

import com.traini8.Traini8.entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Integer> {

    //Declaring custom methods , to tell hibernate to filter data from database

    //This method only fetches those data from database where centerCode matches
    Optional<TrainingCenter> findByCenterCode(String centerCode);

    //This method only fetches those data from database where centerName matches
    Optional<TrainingCenter> findByCenterName(String centerName);


}
