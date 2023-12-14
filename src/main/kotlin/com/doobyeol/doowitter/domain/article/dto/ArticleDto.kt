package com.doobyeol.doowitter.domain.article.dto

import com.doobyeol.doowitter.common.constants.YN
import java.time.LocalDateTime

data class ArticleDto(
    val articleId: Long,
    val type: String,
    val title: String?,
    val content: String?,
    val link: String?,
    val fixYn: String,
    val useYn: YN,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?
)