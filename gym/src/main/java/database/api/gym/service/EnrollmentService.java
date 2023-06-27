package database.api.gym.service;

import database.api.gym.model.Enrollment;
import database.api.gym.model.form.EnrollmentForm;


public interface EnrollmentService {
    Enrollment create (EnrollmentForm form);
    Enrollment get(Long id);
    Enrollment getAll();
    void delete(Long id);
}
