package ua.com.clinicaltrials.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Igor on 05-Oct-16.
 */
@Entity
@Table(name = "CROUkraine")
public class CROUkraine implements Serializable {
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
    @Column(name="phone")
    private String phone;
    @Column(name="fax")
    private String fax;
    @Column(name="email")
    private String email;
    @Column(name="url")
    private String url;
    @Column(name="name_of_headquarter_ua")
    private String nameOfHeadquarterUA;
    @Column(name="name_of_headquarter_ru")
    private String nameOfHeadquarterRU;
    @Column(name="name_of_headquarter_en")
    private String nameOfHeadquarterEN;

    @Column(name="address_of_headquarter_ua")
    private String addressOfHeadquarterUA;
    @Column(name="address_of_headquarter_ru")
    private String addressOfHeadquarterRU;
    @Column(name="address_of_headquarter_en")
    private String addressOfHeadquarterEN;

    @Column(name="phone_of_headquarter")
    private String phoneOfHeadquarter;
    @Column(name="fax_of_headquarter")
    private String faxOfHeadquarter;
    @Column(name="email_of_heeadquarter")
    private String emailOfHeadquarter;
    @Column(name="url_of_headquarter")
    private String UrlOfHeadquarter;

}
