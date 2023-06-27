package database.api.gym.controller;

import database.api.gym.model.Member;
import database.api.gym.model.PhysicalEvaluation;
import database.api.gym.model.form.MemberForm;
import database.api.gym.service.implementation.MemberServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberServiceImpl memberService;

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getAll();
    }

    @PostMapping
    public Member create(@Valid @RequestBody MemberForm form) {
        return memberService.create(form);
    }

    @GetMapping("/evaluations/{id}")
    public List<PhysicalEvaluation> getAllPhysicalEvaluations(@PathVariable Long id) {
        return memberService.getAllPhysicalEvaluationsId(id);
    }
}
