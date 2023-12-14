package com.doobyeol.doowitter.domain.article

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.domain.article.dto.ArticleDto
import com.doobyeol.doowitter.infrastructure.database.article.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    val articleRepository: ArticleRepository
) {
    fun findArticlesByType(type: String): List<ArticleDto> {
        val articles = articleRepository.findAllByTypeAndUseYn(type, YN.Y)
        return articles.map {
            ArticleDto(
                articleId = it.articleId,
                type = it.type,
                title = it.title,
                content = it.content,
                link = it.link,
                fixYn = it.fixYn,
                useYn = it.useYn,
                createdAt = it.createdAt,
                updatedAt = it.updatedAt
            )
        }
    }
}