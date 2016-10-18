package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "study_conduction")
public class StudyConduction {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "location_ua")
    private String locationUA;
    @Column(name = "location_ru")
    private String locationRU;
    @Column(name = "location_en")
    private String locationEN;

}
