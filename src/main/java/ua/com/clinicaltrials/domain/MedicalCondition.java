package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 09-Oct-16.
 */
@Entity
@Table(name = "medical_condition")
public class MedicalCondition {
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

    @Column(name = "short_description_ua")
    private String shortDescriptionUA;
    @Column(name = "short_description_ru")
    private String shortDescriptionRU;
    @Column(name = "short_description_en")
    private String shortDescriptionEN;

    @Column(name = "full_description_ua")
    private String full_descriptionUA;
    @Column(name = "full_description_ru")
    private String full_descriptionRU;
    @Column(name = "full_description_en")
    private String full_descriptionEN;

    @ManyToOne
    @JoinColumn(name = "therapeutic_area_id")
    private TherapeuticArea therapeuticArea;
}
