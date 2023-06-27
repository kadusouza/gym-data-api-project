package database.api.gym.service;

import database.api.gym.model.Member;
import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.MemberUpdateForm;
import database.api.gym.model.form.MemberForm;

import java.util.List;

public interface MemberService {
    Member create(MemberForm form);
    Member get(Long id);
    List<Member> getAll();
    Member update(Long id, MemberUpdateForm form);
    void delete(Long id);
    List<PhysicalEvaluation> getAllPhysicalEvaluationsId(Long id);
}
