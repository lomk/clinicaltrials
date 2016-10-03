package ua.com.clinicaltrials.domain;

/**
 * Created by Igor on 29-Sep-16.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "section")
public class Section {
    private static final long serialVersionUID = -1000119078147256958L;

    @Id
    @Column(name = "section_id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column
    private String url;
    @Column(name = "seo_description", nullable = false, length = 400)
    private String seoDesc;
    @Column(name = "body", nullable = false, length = 10000)
    private String body;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
