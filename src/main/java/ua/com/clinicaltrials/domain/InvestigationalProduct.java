package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "investigational_product")
public class InvestigationalProduct {
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
    @JoinColumn(name = "medical_form_id")
    private MedicalForm medicalForm;

    @ManyToOne
    @JoinColumn(name = "dosage_id")
    private Dosage dosage;

    @ManyToOne
    @JoinColumn(name = "drug_manufacturer_id")
    private DrugManufacturer drugManufacturer;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
