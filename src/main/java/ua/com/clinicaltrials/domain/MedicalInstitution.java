package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 11-Oct-16.
 */
@Entity
@Table(name = "medical_institution")
public class MedicalInstitution implements Serializable {
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
    @JoinColumn(name = "region")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

    @Column(name = "website")
    private String website;

    @Column(name = "phone")
    private String phone;

    @Column(name = "information_desk_phone")
    private String informationDeskPhone;

    @Column(name = "registration_desk_phone")
    private String registrationDeskPhone;

    @Column(name = "reception_phone")
    private String receptionPhone;


}
