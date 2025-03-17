package com.kp_2025_03_17.domain.member.member.entity

import com.kp_2025_03_17.global.jpa.entity.BaseTime
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @Column(unique = true, length = 60)
    var username: String,
    @Column(length = 65)
    var password: String,
    @Column(length = 30)
    var nickname: String
) : BaseTime()