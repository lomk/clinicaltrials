package ua.com.clinicaltrials.domain;

/**
 * Created by Igor on 29-Sep-16.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "section")
public class Section implements Serializable {
    private static final long serialVersionUID = -1000119078147256958L;

    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "name_ru")
    private String nameRU;
    @Column(name = "name_en")
    private String nameEN;
    @Column(name="url")
    private String url;

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

    public String getNameUA() {
        return nameUA;
    }

    public void setNameUA(String nameUA) {
        this.nameUA = nameUA;
    }

    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
