package com.medico.medico.article.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer articleId;
    private String sysCreationDate;
    private String sysUpdateDate;
    private String heading;
    private String content;
    private String tags;
    private String userType;
    private String numberOfViewers;

    public Article(){

    }

    public Article(Integer articleId, String sysCreationDate, String sysUpdateDate, String heading, String content, String tags, String userType, String numberOfViewers) {
        this.articleId = articleId;
        this.sysCreationDate = sysCreationDate;
        this.sysUpdateDate = sysUpdateDate;
        this.heading = heading;
        this.content = content;
        this.tags = tags;
        this.userType = userType;
        this.numberOfViewers = numberOfViewers;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getSysCreationDate() {
        return sysCreationDate;
    }

    public void setSysCreationDate(String sysCreationDate) {
        this.sysCreationDate = sysCreationDate;
    }

    public String getSysUpdateDate() {
        return sysUpdateDate;
    }

    public void setSysUpdateDate(String sysUpdateDate) {
        this.sysUpdateDate = sysUpdateDate;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getNumberOfViewers() {
        return numberOfViewers;
    }

    public void setNumberOfViewers(String numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }
}
