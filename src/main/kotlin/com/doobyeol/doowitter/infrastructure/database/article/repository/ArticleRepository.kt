package com.doobyeol.doowitter.infrastructure.database.article.repository

import com.doobyeol.doowitter.infrastructure.database.article.entity.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository: JpaRepository<Article, Long> {
    fun findAllByTypeAndUseYn(type:String, useYn:String): List<Article>
}