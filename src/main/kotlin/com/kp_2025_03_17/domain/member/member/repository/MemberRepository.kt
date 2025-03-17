package com.kp_2025_03_17.domain.member.member.repository

import com.kp_2025_03_17.domain.member.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>