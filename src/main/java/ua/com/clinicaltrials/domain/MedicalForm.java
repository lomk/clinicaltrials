package ua.com.clinicaltrials.domain;

import javax.persistence.*;

/**
 * Created by Igor on 10-Oct-16.
 */
@Entity
@Table(name = "medical_form")
public class MedicalForm {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "form_ua")
    private String formUA;
    @Column(name = "form_ru")
    private String formRU;
    @Column(name = "form_en")
    private String formEN;
}
