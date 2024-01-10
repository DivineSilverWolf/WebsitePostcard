package ru.nsu.fit.websitepostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.TagForProfile;

@Repository
public interface TagForProfileRepository extends JpaRepository<TagForProfile, Long> {
    // здесь можно добавить дополнительные методы для работы с тегами для профиля
}
