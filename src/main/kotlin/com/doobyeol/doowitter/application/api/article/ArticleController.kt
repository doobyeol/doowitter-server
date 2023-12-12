package com.doobyeol.doowitter.application.api.article

import com.doobyeol.doowitter.application.annotaions.ApiController
import com.doobyeol.doowitter.domain.article.ArticleService
import com.doobyeol.doowitter.domain.article.dto.ArticleDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@ApiController
class ArticleController(
    val articleService: ArticleService
) {

    @GetMapping("/articles/{type}")
    fun findArticles(@PathVariable type:String): ResponseEntity<List<ArticleDto>> {
        return ResponseEntity.ok(articleService.findArticlesByType(type))
    }
}