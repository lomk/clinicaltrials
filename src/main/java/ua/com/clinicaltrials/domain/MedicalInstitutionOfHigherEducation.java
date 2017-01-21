package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by mater on 21-Jan-17.
 */
@Entity
@Table(name = "medical_institution_of_higher_education")
public class MedicalInstitutionOfHigherEducation {
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

    @Column(name = "website")
    private String website;
}
