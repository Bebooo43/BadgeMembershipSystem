package com.example.enity.service;

import com.example.enity.model.Member;
import com.example.enity.model.Role;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);
    Role saveRole(Role role);
    void addRoleToMember(String username,String roleName);
    Member getMember(String username);
    List<Member> getmembers();


}
