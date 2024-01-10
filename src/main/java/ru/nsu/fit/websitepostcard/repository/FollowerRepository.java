package ru.nsu.fit.websitepostcard.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.Follower;
import ru.nsu.fit.websitepostcard.models.FollowerId;

@Repository
public interface FollowerRepository extends JpaRepository<Follower, FollowerId> {
    // здесь можно добавить дополнительные методы для работы с подписчиками
}
