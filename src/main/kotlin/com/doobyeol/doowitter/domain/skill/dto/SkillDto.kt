package com.doobyeol.doowitter.domain.skill.dto

import com.doobyeol.doowitter.common.constants.YN
import java.time.LocalDateTime

data class SkillDto(
    val skillId: Long,
    val name: String,
    val color: String,
    val logoUrl: String?,
    val useYn: YN,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?
)