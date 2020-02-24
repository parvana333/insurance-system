package repository;

import model.Insurance;
import org.springframework.data.repository.CrudRepository;

public interface InsuranceRepository extends CrudRepository<Insurance,Long> {
}
