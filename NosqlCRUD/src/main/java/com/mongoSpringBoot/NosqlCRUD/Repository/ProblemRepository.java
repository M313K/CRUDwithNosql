package com.mongoSpringBoot.NosqlCRUD.Repository;

import com.mongoSpringBoot.NosqlCRUD.Model.Problem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import java.util.Optional;

public interface ProblemRepository extends MongoRepository<Problem, String> {

}
