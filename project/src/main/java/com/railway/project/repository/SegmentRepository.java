package com.railway.project.repository;

import com.railway.project.entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SegmentRepository extends JpaRepository<Segment, Long> {
    void deleteSegmentById(Long id);

    Segment findSegmentById(Long id);
}
