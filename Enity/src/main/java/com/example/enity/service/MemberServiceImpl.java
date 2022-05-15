package com.example.enity.service;

import com.example.enity.model.Member;
import com.example.enity.model.Role;
import com.example.enity.repo.MemberRepo;
import com.example.enity.repo.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @RequiredArgsConstructor
@Transactional
@Slf4j

public class MemberServiceImpl implements MemberService{

    private final MemberRepo memberRepo;

    private final RoleRepository roleRepository;
    @Override
    public Member saveMember(Member member) {
        return memberRepo.save(member);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToMember(String username, String roleName) {
     Member member = memberRepo.findByUsername(username);
     Role role = roleRepository.findByName(roleName);
     member.getRoles().add(role);

    }




    @Override
    public Member getMember(String username) {
        return memberRepo.findByUsername(username);
    }

    @Override
    public List<Member> getmembers() {
        return memberRepo.findAll();
    }
}
