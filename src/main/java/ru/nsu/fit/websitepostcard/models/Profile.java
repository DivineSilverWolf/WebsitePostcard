package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.Column;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "u_id", nullable = false)
    private User user;

    @Column(name = "profile_name", nullable = false)
    private String profileName;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "education", nullable = false)
    private String education;

    @Column(name = "about_me", nullable = false)
    private String aboutMe;

    @Column(name = "profession", nullable = false)
    private String profession;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Profile(User user, String profileName, Date dateOfBirth, String country, String city, String education, String aboutMe, String profession) {
        this.user = user;
        this.profileName = profileName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.city = city;
        this.education = education;
        this.aboutMe = aboutMe;
        this.profession = profession;
    }

    public Profile() {
    }
}