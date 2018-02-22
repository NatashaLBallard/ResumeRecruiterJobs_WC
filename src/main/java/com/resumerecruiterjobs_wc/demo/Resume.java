package com.resumerecruiterjobs_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//
//    //General --------------------------------------------------
//    @NotNull
//    @Size(min=4)
//    private String name;
//
//    @NotNull
//    @Size(min=3)
//    private String email;
//
//    @NotNull
//    @Size(min=5)
//    private String linkedin;
//
//    @NotNull
//    @Size(min=5)
//    private String github;
//
//    @NotNull
//    @Size(min=5)
//    private String twitter;
//
//
//    //Education --------------------------------------------------
//    @NotNull
//    @Size(min=3)
//    private String degree;
//
//    @NotNull
//    @Size(min=5)
//    private String school;
//
//    @NotNull
//    @Size(min=4)
//    private String year;

//
//    //Experience --------------------------------------------------
//    @NotNull
//    @Size(min=4)
//    private String position;
//
//    @NotNull
//    @Size(min=3)
//    private String company;
//
//    @NotNull
//    @Size(min=5)
//    private String location;
//
//    @NotNull
//    @Size(min=5)
//    private String duration;
//
//    @NotNull
//    @Size(min=5)
//    private String description;
//
//
//    //Skill --------------------------------------------------
//    @NotNull
//    @Size(min=3)
//    private String skill;
//
//    @NotNull
//    @Min(1)
//    @Max(5)
//    private String level;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getLinkedin() {
//        return linkedin;
//    }
//
//    public void setLinkedin(String linkedin) {
//        this.linkedin = linkedin;
//    }
//
//    public String getGithub() {
//        return github;
//    }
//
//    public void setGithub(String github) {
//        this.github = github;
//    }
//
//    public String getTwitter() {
//        return twitter;
//    }
//
//    public void setTwitter(String twitter) {
//        this.twitter = twitter;
//    }
//
//    public String getDegree() {
//        return degree;
//    }
//
//    public void setDegree(String degree) {
//        this.degree = degree;
//    }
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getSkill() {
//        return skill;
//    }
//
//    public void setSkill(String skill) {
//        this.skill = skill;
//    }
//
//    public String getLevel() {
//        return level;
//    }
//
//    public void setLevel(String level) {
//        this.level = level;
//    }
}
