package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.*;

@Entity
@Table(name = "links_social_network")
public class LinkSocialNetwork {
    @EmbeddedId
    private LinkSocialNetworkId id;

    @ManyToOne
    @MapsId("profileId")
    @JoinColumn(name = "lt_profile_id", nullable = false)
    private Profile profile;

    @ManyToOne
    @MapsId("socialNetworkId")
    @JoinColumn(name = "sn_id", nullable = false)
    private SocialNetwork socialNetwork;

    @Column(name = "lt_social_link")
    private String socialLink;

    // getters and setters

    public LinkSocialNetworkId getId() {
        return id;
    }

    public void setId(LinkSocialNetworkId id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public SocialNetwork getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public String getSocialLink() {
        return socialLink;
    }

    public void setSocialLink(String socialLink) {
        this.socialLink = socialLink;
    }

    public LinkSocialNetwork(Profile profile, SocialNetwork socialNetwork, String socialLink) {
        this.profile = profile;
        this.socialNetwork = socialNetwork;
        this.socialLink = socialLink;
    }

    public LinkSocialNetwork() {
    }
}