package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.*;

@Entity
@Table(name = "social_network")
public class SocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sn_id")
    private Long id;

    @Column(name = "img_path", nullable = false)
    private String imagePath;

    @Column(name = "domain_name", nullable = false)
    private String domainName;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public SocialNetwork(String imagePath, String domainName) {
        this.imagePath = imagePath;
        this.domainName = domainName;
    }
    public SocialNetwork() {
    }
}
