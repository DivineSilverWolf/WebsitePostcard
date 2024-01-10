package ru.nsu.fit.websitepostcard.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FollowerId implements Serializable {
    @Column(name = "distributor")
    private Long distributor;

    @Column(name = "follower")
    private Long follower;

    // getters and setters

    public Long getDistributor() {
        return distributor;
    }

    public void setDistributor(Long distributor) {
        this.distributor = distributor;
    }

    public Long getFollower() {
        return follower;
    }

    public void setFollower(Long follower) {
        this.follower = follower;
    }

    public FollowerId(Long distributor, Long follower) {
        this.distributor = distributor;
        this.follower = follower;
    }

    public FollowerId() {
    }
}