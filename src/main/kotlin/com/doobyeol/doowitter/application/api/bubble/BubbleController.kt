package com.doobyeol.doowitter.application.api.bubble

import com.doobyeol.doowitter.application.annotaions.ApiController
import com.doobyeol.doowitter.domain.bubble.BubbleService
import com.doobyeol.doowitter.domain.bubble.dto.BubbleDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@ApiController
class BubbleController(
    val bubbleService: BubbleService
) {

    @GetMapping("/bubbles")
    fun findBubbles(): ResponseEntity<List<BubbleDto>> {
        return ResponseEntity.ok(bubbleService.findBubbles())
    }
}