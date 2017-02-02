package ua.com.clinicaltrials.domain;

/**
 * Created by Igor on 29-Sep-16.
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "section")
@Getter
@Setter
public class Section implements Serializable {
    private static final long serialVersionUID = -1000119092147226958L;

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

}
