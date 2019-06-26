package service;

import entity.UnlawfulEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UnlawfulEntityManager {
    Page<UnlawfulEntity> getAllUnlawfulEntity(Pageable pageable);

    void saveUnlawful(UnlawfulEntity unlawfulEntity);

    void deleteUnlawful(String id);

    Optional<UnlawfulEntity> findById(String id);
}
