package ru.nsu.fit.websitepostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // здесь можно добавить дополнительные методы для работы с профилями
}
