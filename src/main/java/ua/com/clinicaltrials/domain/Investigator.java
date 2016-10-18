package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Igor on 11-Oct-16.
 */
public class Investigator implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany
    @JoinTable(name = "investigator_degree",
            joinColumns = {@JoinColumn(name = "investigator_id")},
            inverseJoinColumns = {@JoinColumn(name = "degree_id")}
    )

    @Column(name = "first_name_ua")
    private String firstNameUA;
    @Column(name = "first_name_ru")
    private String firstNameRU;
    @Column(name = "first_name_en")
    private String firstNameEN;

    @Column(name = "last_name_ua")
    private String lastNameUA;
    @Column(name = "last_name_ru")
    private String lastNameRU;
    @Column(name = "last_name_en")
    private String last_nameEN;

    @Column(name = "patronymic_name_ua")
    private String patronymicNameUA;
    @Column(name = "patronymic_name_ru")
    private String patronymicNameRU;
    @Column(name = "patronymic_name_en")
    private String patronymicNameEN;
    @Column(name = "birthDate")
    private String birthDate;

    @OneToMany(mappedBy = "investigator", targetEntity = InvestigatorPhone.class)
    private Set<InvestigatorPhone> phoneSet;
    @OneToMany(mappedBy = "investigator", targetEntity = InvestigatorPhoneMobile.class)
    private Set<InvestigatorPhoneMobile> phoneMobileSet;
    @OneToMany(mappedBy = "investigator", targetEntity = InvestigatorFax.class)
    private Set<InvestigatorFax> faxSet;


}
