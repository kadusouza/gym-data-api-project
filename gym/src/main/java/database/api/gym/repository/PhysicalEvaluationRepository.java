package database.api.gym.repository;

import database.api.gym.model.PhysicalEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEvaluationRepository extends JpaRepository<PhysicalEvaluation, Long> {
}
