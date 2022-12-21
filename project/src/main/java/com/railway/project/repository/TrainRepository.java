package com.railway.project.repository;

import com.railway.project.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {

    void deleteTrainById(Long id);

    Train findTrainById(Long id);


}
