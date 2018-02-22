package com.resumerecruiterjobs_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JobEntry {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    //Experience --------------------------------------------------
    @NotNull
    @Size(min=4)
    private String title;

    @NotNull
    @Size(min=3)
    private String jobId;


    @NotNull
    @Size(min=3)
    private String organization;

    @NotNull
    @Size(min=5)
    private String location;

    @NotNull
    @Size(min=3)
    private String description;

    @NotNull
    @Size(min=3)
    private String duties;

    @NotNull
    @Size(min=3)
    private String qualifications;

}
