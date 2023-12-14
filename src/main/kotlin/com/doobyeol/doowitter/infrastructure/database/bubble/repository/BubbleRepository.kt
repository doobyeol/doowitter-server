package com.doobyeol.doowitter.infrastructure.database.bubble.repository

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.infrastructure.database.bubble.entity.Bubble
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BubbleRepository: JpaRepository<Bubble, Long> {
    fun findAllByUseYn(useYn: YN): List<Bubble>
}