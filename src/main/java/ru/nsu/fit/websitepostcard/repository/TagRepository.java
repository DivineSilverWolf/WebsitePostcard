package ru.nsu.fit.websitepostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, String> {
    // здесь можно добавить дополнительные методы для работы с тегами
}