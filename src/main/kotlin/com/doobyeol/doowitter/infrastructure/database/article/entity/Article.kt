package com.doobyeol.doowitter.infrastructure.database.article.entity

import com.doobyeol.doowitter.infrastructure.database.common.entity.AuditingEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "article")
@Entity
class Article(
    @Id
    @Column(name = "article_id")
    var articleId: Long,

    @Column(name = "type")
    var type: String,

    @Column(name = "title")
    var title: String?,

    @Column(name = "content")
    var content: String?,

    @Column(name = "link")
    var link: String?,

    @Column(name = "fix_yn")
    var fixYn: String,

    @Column(name = "use_yn")
    var useYn: String,
) : AuditingEntity()