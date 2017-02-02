package ua.com.clinicaltrials.domain;

import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class Article implements Serializable {
    private static final long serialVersionUID = -1000119478147250324L;

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


}
