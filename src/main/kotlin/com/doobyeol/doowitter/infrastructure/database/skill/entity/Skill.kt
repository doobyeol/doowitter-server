package com.doobyeol.doowitter.infrastructure.database.skill.entity

import com.doobyeol.doowitter.infrastructure.database.common.entity.AuditingEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "skill")
@Entity
class Skill(
    @Id
    @Column(name = "skill_id")
    var skillId: Long,

    @Column(name = "skill_name")
    var skillName: String,

    @Column(name = "color")
    var color: String,

    @Column(name = "logo_url")
    var logoUrl: String?,

    @Column(name = "use_yn")
    var useYn: String,
) : AuditingEntity()