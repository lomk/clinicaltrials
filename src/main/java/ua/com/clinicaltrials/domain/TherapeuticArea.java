package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "study_status")
public class TherapeuticArea {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "name_ru")
    private String nameRU;
    @Column(name = "name_en")
    private String nameEN;
}
