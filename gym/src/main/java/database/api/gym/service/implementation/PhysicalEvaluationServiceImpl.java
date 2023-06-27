package database.api.gym.service.implementation;

import database.api.gym.model.Member;
import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.PhysicalEvaluationForm;
import database.api.gym.model.form.PhysicalEvaluationUpdateForm;
import database.api.gym.repository.MemberRepository;
import database.api.gym.repository.PhysicalEvaluationRepository;
import database.api.gym.service.PhysicalEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PhysicalEvaluationServiceImpl implements PhysicalEvaluationService {

    @Autowired
    private PhysicalEvaluationRepository evaluationRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public PhysicalEvaluation create(PhysicalEvaluationForm form) {
        PhysicalEvaluation physicalEvaluation = new PhysicalEvaluation();
        Member member = memberRepository.findById(form.getId()).get();

        physicalEvaluation.setMember(member);
        physicalEvaluation.setWeight(form.getWeight());
        physicalEvaluation.setHeight(form.getHeight());
        return evaluationRepository.save(physicalEvaluation);
    }

    @Override
    public PhysicalEvaluation get(Long id) {
        return null;
    }

    @Override
    public List<PhysicalEvaluation> getAll() {
        return null;
    }

    @Override
    public PhysicalEvaluation update(Long id, PhysicalEvaluationUpdateForm form) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
