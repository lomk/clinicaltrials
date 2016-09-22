package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Igor on 19-Jul-16.
 */
@Entity
@Table(name = "article")
public class Article {
    @Id
    @Column(name = "article_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "title", nullable = false, length = 200)
    private String title;
    @Column(name = "description", nullable = false, length = 400)
    private String desc;
    @Column(name = "seo_description", nullable = false, length = 400)
    private String seoDesc;
    @Column(name = "body", nullable = false, length = 10000)
    private String body;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_FIELD")
    private Date dateField;
    @Column(name = "rating", nullable = false)
    private Long rating;
    @Column (name = "img_url")
    private String imgUrl;

    @OneToMany(mappedBy = "article", targetEntity = Comment.class)
    @OrderBy("dateTimeField ASC")
    private Set<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinColumn(name = "tag_id")
    private Set<Tag> tags ;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSeoDesc() {
        return seoDesc;
    }

    public void setSeoDesc(String seoDesc) {
        this.seoDesc = seoDesc;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateField() {
        return dateField;
    }

    public void setDateField(Date dateField) {
        this.dateField = dateField;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
