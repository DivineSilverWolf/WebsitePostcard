package ru.nsu.fit.websitepostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // здесь можно добавить дополнительные методы для работы с постами
}