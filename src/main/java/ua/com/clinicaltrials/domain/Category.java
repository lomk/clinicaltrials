package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Igor on 06-Jul-16.
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {
    private static final long serialVersionUID = -1000119478147252957L;

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column
    private String url;

    @OneToMany(mappedBy = "category", targetEntity = Article.class)
    @OrderBy("dateField ASC")
    private Set<Article> articles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
