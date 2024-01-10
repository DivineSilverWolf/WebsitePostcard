package ru.nsu.fit.websitepostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.websitepostcard.models.LinkSocialNetwork;
import ru.nsu.fit.websitepostcard.models.LinkSocialNetworkId;

@Repository
public interface LinkSocialNetworkRepository extends JpaRepository<LinkSocialNetwork, LinkSocialNetworkId> {
    // здесь можно добавить дополнительные методы для работы с ссылками на социальные сети
}