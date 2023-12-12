package com.doobyeol.doowitter.domain.article.dto

import java.time.LocalDateTime

data class ArticleDto(
    val articleId: Long,
    val type: String,
    val title: String?,
    val content: String?,
    val link: String?,
    val fixYn: String,
    val useYn: String,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?
)