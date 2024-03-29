package com.hororok.monta.repository;

import com.hororok.monta.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    Optional<Member> findOneByAccountId(UUID accountId);
}
