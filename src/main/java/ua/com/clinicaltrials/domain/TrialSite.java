package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 11-Oct-16.
 */
@Entity
@Table(name = "trial_site")
public class TrialSite implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "region")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

    @ManyToOne
    @JoinColumn(name = "principal_investigator_position_id")
    private AcademicDegree principalInvestigatorPosition;

    @ManyToOne
    @JoinColumn(name = "investigator_id")
    private Investigator investigator;

    @ManyToOne
    @JoinColumn(name = "medical_institution_department_id")
    private MedicalInstitutionDepartment medicalInstitutionDepartment;

    @ManyToOne
    @JoinColumn(name = "medical_institution_department_id")
    private MedicalInstitutionDepartment medicalInstitutionOfHigherEducationDepartment;

    @ManyToOne
    @JoinColumn(name = "recruitment_status_clinicaltrialsgov_id")
    private RecruitmentStatus recruitmentStatusclinicaltrialsGov;

    @ManyToOne
    @JoinColumn(name = "recruitment_status_moh_id")
    private RecruitmentStatus recruitmentStatusMOH;

    @ManyToOne
    @JoinColumn(name = "recruitment_status_company_id")
    private RecruitmentStatus recruitmentStatusCompany;

    @Column(name = "final_enrollment")
    private Integer finalEnrollment;
}
