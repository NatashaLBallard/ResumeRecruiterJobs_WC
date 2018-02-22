package com.resumerecruiterjobs_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Reference {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=5)
    private String referenceName;


    @NotNull
    @Size(min=5)
    private String referencePosition;


    @NotNull
    @Size(min=5)
    private String referenceOrganization;


    @NotNull
    @Size(min=10)
    private String referencePhoneNumber;


    @NotNull
    @Size(min=5)
    private String referenceEmail;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferencePosition() {
        return referencePosition;
    }

    public void setReferencePosition(String referencePosition) {
        this.referencePosition = referencePosition;
    }

    public String getReferenceOrganization() {
        return referenceOrganization;
    }

    public void setReferenceOrganization(String referenceOrganization) {
        this.referenceOrganization = referenceOrganization;
    }

    public String getReferencePhoneNumber() {
        return referencePhoneNumber;
    }

    public void setReferencePhoneNumber(String referencePhoneNumber) {
        this.referencePhoneNumber = referencePhoneNumber;
    }

    public String getReferenceEmail() {
        return referenceEmail;
    }

    public void setReferenceEmail(String referenceEmail) {
        this.referenceEmail = referenceEmail;
    }
}
