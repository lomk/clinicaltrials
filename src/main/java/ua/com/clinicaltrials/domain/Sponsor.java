package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 06-Oct-16.
 */
@Entity
@Table(name = "sponsor")
public class Sponsor implements Serializable {
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
    @Column(name="adress_ua")
    private String adressUA;
    @Column(name="adress_ru")
    private String adressRU;
    @Column(name="adress_en")
    private String adressEN;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    @Column(name = "url")
    private String url;
    @Column(name = "ukraine_department_name_ua")
    private String ukraineDepartmentNameUA;
    @Column(name = "ukraine_department_name_ru")
    private String ukraineDepartmentNameRU;
    @Column(name = "ukraine_department_name_en")
    private String ukraineDepartmentNameEN;
    @Column(name = "ukraine_department_adress_ua")
    private String ukraineDepartmentAdressUA;
    @Column(name = "ukraine_department_adress_ru")
    private String ukraineDepartmentAdressRU;
    @Column(name = "ukraine_department_adress_en")
    private String ukraineDepartmentAdressEN;
    @Column(name = "ukraine_department_phone")
    private String ukraineDepartmentPhone;
    @Column(name = "ukraine_department_fax")
    private String ukraineDepartmentFax;
    @Column(name = "ukraine_department_email")
    private String ukraineDepartmentEmail;
    @Column(name = "ukraine_department_url")
    private String ukraineDepartmentUrl;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
