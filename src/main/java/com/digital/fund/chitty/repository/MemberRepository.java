package com.digital.fund.chitty.repository;

import com.digital.fund.chitty.entity.Member;
import com.digital.fund.chitty.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
