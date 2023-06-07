package com.mongoSpringBoot.NosqlCRUD.Controller;

import com.mongoSpringBoot.NosqlCRUD.Model.Problem;
import com.mongoSpringBoot.NosqlCRUD.Repository.ProblemRepository;
import com.mongoSpringBoot.NosqlCRUD.Service.ProblemService;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class ProblemController {
    @Autowired
    private ProblemService problemService;
    @PostMapping("/add")
    public ResponseEntity<?> saveProblem(@RequestBody Problem problem){
        problemService.add(problem);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Problem> getProblems() {

        return problemService.getall();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProblem(@PathVariable String id){
        problemService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
