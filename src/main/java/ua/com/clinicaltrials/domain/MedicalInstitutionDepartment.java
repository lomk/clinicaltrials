package ua.com.clinicaltrials.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 11-Oct-16.
 */
@Entity
@Table(name = "medical_institution_department")
@Getter
@Setter
public class MedicalInstitutionDepartment implements Serializable {
    private static final long serialVersionUID = -1000139478197452957L;

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
    @JoinColumn(name = "medical_institution_id")
    private String medicalInstitution;


    @Column(name = "department_lead")
    private String departmentLead;

    @Column(name = "phone")
    private String phone;

}
