package database.api.gym.service;

import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.PhysicalEvaluationForm;
import database.api.gym.model.form.PhysicalEvaluationUpdateForm;

import java.util.List;

public interface PhysicalEvaluationService {
    PhysicalEvaluation create(PhysicalEvaluationForm form);
    PhysicalEvaluation get(Long id);
    List<PhysicalEvaluation> getAll();
    PhysicalEvaluation update(Long id, PhysicalEvaluationUpdateForm form);
    void delete(Long id);

}
