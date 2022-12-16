package com.railway.project.service;

import com.railway.project.entity.Segment;
import com.railway.project.repository.SegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentService {

    private final SegmentRepository segmentRepository;

    @Autowired
    public  SegmentService(SegmentRepository segmentRepository) {this.segmentRepository = segmentRepository;}
    public Segment addSegment(Segment segment) {
        segment.setId(segment.getId());
        return (Segment) segmentRepository.save(segment);
    }

    public List<Segment> findAllSegments() {
        return segmentRepository.findAll();
    }

    public Segment updateSegment(Segment segment){
        return (Segment) segmentRepository.save(segment);
    }

    public Segment findSegmentById(Long id) {
        return segmentRepository.findSegmentById(id); //.orElseThrow()
    }

    public void deleteSegment(Long id){
        segmentRepository.deleteSegmentById(id);
    }

}
