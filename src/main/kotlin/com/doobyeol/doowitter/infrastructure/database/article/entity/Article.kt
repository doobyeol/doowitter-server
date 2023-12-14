package com.doobyeol.doowitter.infrastructure.database.article.entity

import com.doobyeol.doowitter.common.constants.YN
import com.doobyeol.doowitter.infrastructure.database.common.entity.AuditingEntity
import javax.persistence.*

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
    @Enumerated(EnumType.STRING)
    var useYn: YN,
) : AuditingEntity()