package cap.Assignment7.dataRepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends MongoRepository<Orders, String> {
}