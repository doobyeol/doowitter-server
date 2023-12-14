package com.doobyeol.doowitter.domain.bubble

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.domain.bubble.dto.BubbleDto
import com.doobyeol.doowitter.infrastructure.database.bubble.repository.BubbleRepository
import org.springframework.stereotype.Service

@Service
class BubbleService(
    val bubbleRepository: BubbleRepository
) {
    fun findBubbles(): List<BubbleDto> {
        val bubbles = bubbleRepository.findAllByUseYn(YN.Y)
        return bubbles.map {
            BubbleDto(
                bubbleId = it.bubbleId,
                word = it.word
            )
        }
    }
}