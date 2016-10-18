package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "material")
public class StudyRelatedMaterial {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "drug_manufacturer_id")
    private DrugManufacturer drugManufacturer;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
