package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.util.SortedSet;

/**
 * Created by Igor on 09-Oct-16.
 */@Entity
@Table(name = "study_general_information")
public class StudyGeneralInformation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "medical_condition_id")
    private MedicalCondition medicalCondition;

    @Column(name = "protocol_title_ua")
    private String protocolTitleUA;

    @Column(name = "protocol_title_ru")
    private String protocolTitleRU;

    @Column(name = "protocol_title_en")
    private String protocolTitleEN;

    @Column(name = "detailed_description_ua")
    private String detailedDescriptionUA;

    @Column(name = "detailed_description_ru")
    private String detailedDescriptionRU;

    @Column(name = "detailed_description_en")
    private String detailedDescriptionEN;

    @Column(name = "purpose")
    private String purpose;

    @ManyToOne
    @JoinColumn(name = "phase_id")
    private Phase phase;

    @ManyToOne
    @JoinColumn(name = "study_type_id")
    private StudyType studyType;

    @ManyToOne
    @JoinColumn(name = "study_design_allocation")
    private StudyDesignAllocation studyDesignAllocation;

    @ManyToOne
    @JoinColumn(name = "study_design_endpoint_classification")
    private StudyDesignEndpointClassification studyDesignEndpointClassification;

    @ManyToOne
    @JoinColumn(name = "study_design_intervention_model")
    private StudyDesignInterventionModel studyDesignInterventionModel;

    @ManyToOne
    @JoinColumn(name = "study_design_masking")
    private StudyDesignMasking masking;

    @ManyToOne
    @JoinColumn(name = "study_design_primary_purpose")
    private StudyDesignPrimaryPurpose primaryPurpose;

    @ManyToOne
    @JoinColumn(name = "study_design_observationModel")
    private StudyDesignObservationalModel observationalModel;

    @ManyToOne
    @JoinColumn(name = "study_design_time_perspective")
    private StudyDesignTimePerspective timePerspective;

    @Column(name = "quantity_of_trial_sites")
    private Integer quantityOfTrialSites;

    @ManyToOne
    @JoinColumn(name = "study_conduction_id")
    private StudyConduction studyConduction;

    @ManyToMany
    @JoinTable(name = "study_general_information_country",
            joinColumns = {@JoinColumn(name = "study_general_info_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id")}
    )
    private SortedSet<StudyConductionCountry> studyConductionCountries;

    @ManyToMany
    @JoinColumn(name = "investigational_product_id")
    private InvestigationalProduct investigationalProduct;

    @ManyToMany
    @JoinTable(name = "study_general_information_comparator",
            joinColumns = {@JoinColumn(name = "study_general_information_id")},
            inverseJoinColumns = {@JoinColumn(name = "comparator_id")}
    )
    private SortedSet<Comparator> comparators;

    @ManyToMany
    @JoinTable(name = "study_general_information_material",
            joinColumns = {@JoinColumn(name = "study_general_information_id")},
            inverseJoinColumns = {@JoinColumn(name = "material_id")}
    )
    private SortedSet<StudyRelatedMaterial> studyRelatedMaterials;
}
