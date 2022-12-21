package com.railway.project.service;


import com.railway.project.entity.Train;
import com.railway.project.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private final TrainRepository trainRepository;
    @Autowired
    public  TrainService(TrainRepository trainRepository) {this.trainRepository = trainRepository;}

    public Train addTrain(Train train) {
        train.setId(train.getId());
        return (Train) trainRepository.save(train);
    }

    public List<Train> findAllTrains() {
        return trainRepository.findAll();
    }

    public Train updateTrain(Train train){
        return (Train) trainRepository.save(train);
    }

    public Train findTrainById(Long id) {
        return trainRepository.findTrainById(id); //.orElseThrow()
    }

    public void deleteTrain(Long id){
        trainRepository.deleteTrainById(id);
    }

}
