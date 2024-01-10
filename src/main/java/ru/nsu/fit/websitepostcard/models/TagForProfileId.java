package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class TagForProfileId implements Serializable {
    @Column(name = "tfp_profile_id")
    private Long profileId;

    @Column(name = "tfp_tag_name")
    private String tagName;

    public TagForProfileId(Long profileId, String tagName) {
        this.profileId = profileId;
        this.tagName = tagName;
    }

    public TagForProfileId() {
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
