package com.doobyeol.doowitter.application.api.skill

import com.doobyeol.doowitter.application.annotaions.ApiController
import com.doobyeol.doowitter.domain.skill.SkillService
import com.doobyeol.doowitter.domain.skill.dto.SkillDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@ApiController
class SkillController(
    val skillService: SkillService
) {

    @GetMapping("/skills")
    fun findSkills() : ResponseEntity<List<SkillDto>> {
        return ResponseEntity.ok(skillService.findSkills())
    }
}