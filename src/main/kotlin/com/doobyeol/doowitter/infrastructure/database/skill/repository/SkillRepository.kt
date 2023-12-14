package com.doobyeol.doowitter.infrastructure.database.skill.repository

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.infrastructure.database.skill.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SkillRepository: JpaRepository<Skill, Long> {
    fun findAllByUseYn(useYn:YN): List<Skill>
}