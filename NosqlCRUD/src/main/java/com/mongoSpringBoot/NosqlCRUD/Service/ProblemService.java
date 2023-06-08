package com.mongoSpringBoot.NosqlCRUD.Service;

import com.mongoSpringBoot.NosqlCRUD.Model.Problem;
import com.mongoSpringBoot.NosqlCRUD.Repository.ProblemRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class ProblemService {
    @Autowired
    private ProblemRepository problemRepository;

    public String add(Problem problem){
        problemRepository.save(problem);
        return "success";
    }


    public List<Problem> getall() {

        return problemRepository.findAll();
    }


    public String delete(String id){
        problemRepository.deleteById(id);

        return "Deleted Successfully";
    }

}
