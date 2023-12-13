package com.doobyeol.doowitter.domain.skill.dto

import java.time.LocalDateTime

data class SkillDto(
    val skillId: Long,
    val name: String,
    val color: String,
    val logoUrl: String?,
    val useYn: String,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?
)