package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.*;

@Entity
@Table(name = "followers")
public class Follower {
    @EmbeddedId
    private FollowerId id;

    @ManyToOne
    @MapsId("distributor")
    @JoinColumn(name = "distributor", nullable = false)
    private Profile distributor;

    @ManyToOne
    @MapsId("follower")
    @JoinColumn(name = "follower", nullable = false)
    private User follower;

    // getters and setters

    public FollowerId getId() {
        return id;
    }

    public void setId(FollowerId id) {
        this.id = id;
    }

    public Profile getDistributor() {
        return distributor;
    }

    public void setDistributor(Profile distributor) {
        this.distributor = distributor;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public Follower(FollowerId id, Profile distributor, User follower) {
        this.id = id;
        this.distributor = distributor;
        this.follower = follower;
    }

    public Follower() {
    }
}
