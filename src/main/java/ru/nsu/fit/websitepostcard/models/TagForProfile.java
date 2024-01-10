package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tags_for_profile")
public class TagForProfile {
    @EmbeddedId
    private TagForProfileId id;
    @ManyToOne
    @MapsId("profileId")
    @JoinColumn(name = "tfp_profile_id", nullable = false)
    private Profile tfpProfileId;

    @ManyToOne
    @MapsId("tagName")
    @JoinColumn(name = "tfp_tag_name", nullable = false)
    private Tag tfpTagName;

    // getters and setters


    public TagForProfileId getId() {
        return id;
    }

    public void setId(TagForProfileId id) {
        this.id = id;
    }

    public Profile getTfpProfileId() {
        return tfpProfileId;
    }

    public void setTfpProfileId(Profile profile) {
        this.tfpProfileId = profile;
    }

    public Tag getTfpTagName() {
        return tfpTagName;
    }

    public void setTfpTagName(Tag tags) {
        this.tfpTagName = tags;
    }
    public TagForProfile(TagForProfileId id, Profile profile, Tag tags) {
        this.id = id;
        this.tfpProfileId = profile;
        this.tfpTagName = tags;
    }
    public TagForProfile() {}
}
