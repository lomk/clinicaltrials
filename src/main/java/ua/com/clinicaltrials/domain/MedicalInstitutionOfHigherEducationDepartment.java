package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by mater on 21-Jan-17.
 */
@Entity
@Table(name = "medical_institution_of_higher_education_department")
public class MedicalInstitutionOfHigherEducationDepartment {
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

    @ManyToOne
    @JoinColumn(name = "medical_institution_of_higher_education_id")
    private String medicalInstitutionOfHigherEducation;
}
