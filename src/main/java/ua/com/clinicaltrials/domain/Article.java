package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Igor on 19-Jul-16.
 */
@Entity
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "title_ua", nullable = false, length = 200)
    private String titleUA;
    @Column(name = "title_ru", nullable = false, length = 200)
    private String titleRU;
    @Column(name = "title_en", nullable = false, length = 200)
    private String titleEN;
    @Column(name = "description_ua", nullable = false, length = 400)
    private String descUA;
    @Column(name = "description_ru", nullable = false, length = 400)
    private String descRU;
    @Column(name = "description_en", nullable = false, length = 400)
    private String descEN;

    @Column(name = "seo_description_ua", nullable = false, length = 400)
    private String seoDescUA;
    @Column(name = "seo_description_ru", nullable = false, length = 400)
    private String seoDescRU;
    @Column(name = "seo_description_en", nullable = false, length = 400)
    private String seoDescEN;

    @Column(name = "body_ua", nullable = false, length = 10000)
    private String bodyUA;
    @Column(name = "body_ru", nullable = false, length = 10000)
    private String bodyRU;
    @Column(name = "body_en", nullable = false, length = 10000)
    private String bodyEN;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_field")
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

    public String getTitleUA() {
        return titleUA;
    }

    public void setTitleUA(String titleUA) {
        this.titleUA = titleUA;
    }

    public String getTitleRU() {
        return titleRU;
    }

    public void setTitleRU(String titleRU) {
        this.titleRU = titleRU;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getDescUA() {
        return descUA;
    }

    public void setDescUA(String descUA) {
        this.descUA = descUA;
    }

    public String getDescRU() {
        return descRU;
    }

    public void setDescRU(String descRU) {
        this.descRU = descRU;
    }

    public String getDescEN() {
        return descEN;
    }

    public void setDescEN(String descEN) {
        this.descEN = descEN;
    }

    public String getSeoDescUA() {
        return seoDescUA;
    }

    public void setSeoDescUA(String seoDescUA) {
        this.seoDescUA = seoDescUA;
    }

    public String getSeoDescRU() {
        return seoDescRU;
    }

    public void setSeoDescRU(String seoDescRU) {
        this.seoDescRU = seoDescRU;
    }

    public String getSeoDescEN() {
        return seoDescEN;
    }

    public void setSeoDescEN(String seoDescEN) {
        this.seoDescEN = seoDescEN;
    }

    public String getBodyUA() {
        return bodyUA;
    }

    public void setBodyUA(String bodyUA) {
        this.bodyUA = bodyUA;
    }

    public String getBodyRU() {
        return bodyRU;
    }

    public void setBodyRU(String bodyRU) {
        this.bodyRU = bodyRU;
    }

    public String getBodyEN() {
        return bodyEN;
    }

    public void setBodyEN(String bodyEN) {
        this.bodyEN = bodyEN;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
}
