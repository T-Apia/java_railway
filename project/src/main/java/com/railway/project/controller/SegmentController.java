package com.railway.project.controller;

import com.railway.project.entity.Segment;
import com.railway.project.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("*")
@RestController
@Transactional
@RequestMapping("/segment")
public class SegmentController {

    @Autowired
    private SegmentService service;
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<List<Segment>> getAllSegments(){
        List<Segment> segments = service.findAllSegments();
        return new ResponseEntity<>(segments, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Segment> getSegmentById(@PathVariable("id") Long id){
        Segment segment = service.findSegmentById(id);
        return new ResponseEntity<>(segment, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Segment> addSegment(@RequestBody Segment segment){
        Segment newSegment = service.addSegment(segment);
        return new ResponseEntity<>(newSegment, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Segment> updateSegment(@RequestBody Segment segment){
        Segment updateSegment = service.updateSegment(segment);
        return new ResponseEntity<>(updateSegment, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteSegment(@PathVariable("id") Long id){
        service.deleteSegment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
