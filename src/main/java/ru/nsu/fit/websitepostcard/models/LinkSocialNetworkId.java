package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LinkSocialNetworkId implements Serializable {
    @Column(name = "lt_profile_id")
    private Long profileId;

    @Column(name = "sn_id")
    private Long socialNetworkId;

    // getters and setters

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public Long getSocialNetworkId() {
        return socialNetworkId;
    }

    public void setSocialNetworkId(Long socialNetworkId) {
        this.socialNetworkId = socialNetworkId;
    }

    public LinkSocialNetworkId(Long profileId, Long socialNetworkId) {
        this.profileId = profileId;
        this.socialNetworkId = socialNetworkId;
    }

    public LinkSocialNetworkId() {
    }
}
