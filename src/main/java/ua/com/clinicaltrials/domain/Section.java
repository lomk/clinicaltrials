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
}
