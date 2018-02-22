package com.resumerecruiterjobs_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CoverLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String paragraphIntro;

    @NotNull
    private String paragraphOne;

    @NotNull
    private String paragraphTwo;

    @NotNull
    private String paragraphThree;

    @NotNull
    private String paragraphOutro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParagraphIntro() {
        return paragraphIntro;
    }

    public void setParagraphIntro(String paragraphIntro) {
        this.paragraphIntro = paragraphIntro;
    }

    public String getParagraphOne() {
        return paragraphOne;
    }

    public void setParagraphOne(String paragraphOne) {
        this.paragraphOne = paragraphOne;
    }

    public String getParagraphTwo() {
        return paragraphTwo;
    }

    public void setParagraphTwo(String paragraphTwo) {
        this.paragraphTwo = paragraphTwo;
    }

    public String getParagraphThree() {
        return paragraphThree;
    }

    public void setParagraphThree(String paragraphThree) {
        this.paragraphThree = paragraphThree;
    }

    public String getParagraphOutro() {
        return paragraphOutro;
    }

    public void setParagraphOutro(String paragraphOutro) {
        this.paragraphOutro = paragraphOutro;
    }
}
