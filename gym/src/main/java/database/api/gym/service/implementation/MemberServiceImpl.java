package database.api.gym.service.implementation;

import database.api.gym.model.Member;
import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.MemberForm;
import database.api.gym.model.form.MemberUpdateForm;
import database.api.gym.repository.MemberRepository;
import database.api.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());
        member.setDocumentId(form.getDocumentId());
        member.setDistrict(form.getDistrict());
        member.setBirth(form.getBirth());
        return memberRepository.save(member);
    }

    @Override
    public Member get(Long id) {
        return null;
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member update(Long id, MemberUpdateForm form) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalEvaluation> getAllPhysicalEvaluationsId(Long id) {
        Member member =  memberRepository.findById(id).get();
        return member.getEvaluationList();
    }
}
