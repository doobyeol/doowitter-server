package com.doobyeol.doowitter.infrastructure.database.bubble.entity

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.infrastructure.database.common.entity.AuditingEntity
import javax.persistence.*

@Table(name = "bubble")
@Entity
class Bubble(
    @Id
    @Column(name = "bubble_id")
    var bubbleId: Long,

    @Column(name = "word")
    var word: String,

    @Column(name = "use_yn")
    @Enumerated(EnumType.STRING)
    var useYn: YN,
) : AuditingEntity()