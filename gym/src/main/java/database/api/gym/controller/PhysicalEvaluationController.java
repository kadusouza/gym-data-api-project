package database.api.gym.controller;

import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.PhysicalEvaluationForm;
import database.api.gym.service.implementation.PhysicalEvaluationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class PhysicalEvaluationController {

    @Autowired
    private PhysicalEvaluationServiceImpl physicalEvaluationService;

    @PostMapping
    public PhysicalEvaluation create(@RequestBody PhysicalEvaluationForm form) {
        return physicalEvaluationService.create(form);
    }

}
