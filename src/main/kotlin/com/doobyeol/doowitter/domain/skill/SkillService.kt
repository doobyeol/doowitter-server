package com.doobyeol.doowitter.domain.skill

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.domain.skill.dto.SkillDto
import com.doobyeol.doowitter.infrastructure.database.skill.repository.SkillRepository
import org.springframework.stereotype.Service

@Service
class SkillService(
    val skillRepository: SkillRepository
) {
    fun findSkills(): List<SkillDto> {
        val skills = skillRepository.findAllByUseYn(YN.Y)
        return skills.map {
            SkillDto(
                skillId = it.skillId,
                name = it.skillName,
                color = it.color,
                logoUrl = it.logoUrl,
                useYn = it.useYn,
                createdAt = it.createdAt,
                updatedAt = it.updatedAt
            )
        }
    }
}