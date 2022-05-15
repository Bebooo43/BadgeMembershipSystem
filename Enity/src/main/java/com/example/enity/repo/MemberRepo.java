package com.example.enity.repo;

import com.example.enity.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MemberRepo  extends JpaRepository<Member,Long> {

    Member findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
