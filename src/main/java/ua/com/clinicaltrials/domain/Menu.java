package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 29-Sep-16.
 */

@Entity
@Table(name = "menu")
public class Menu {
    private static final long serialVersionUID = -1200119078167252957L;

    @Id
    @Column(name = "menu_id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "menu", targetEntity = Section.class)
    @OrderBy("section_id")
    public List<Section> sections;

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

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
