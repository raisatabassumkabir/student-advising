package bd.edu.seu.student.repository;


import bd.edu.seu.student.model.Advising;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvisingRepository extends MongoRepository<Advising, String> {


}
