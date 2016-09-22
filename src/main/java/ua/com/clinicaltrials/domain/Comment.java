package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Igor on 19-Jul-16.
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "comment_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "body", nullable = false, length = 2000)
    private String body;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_FIELD")
    private Date dateTimeField;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateTimeField() {
        return dateTimeField;
    }

    public void setDateTimeField(Date dateTimeField) {
        this.dateTimeField = dateTimeField;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
