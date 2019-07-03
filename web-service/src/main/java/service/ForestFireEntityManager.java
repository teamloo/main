package service;

import entity.ForestFireEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ForestFireEntityManager {
    Page<ForestFireEntity> getAllForestFire(Pageable pageable);

    void saveForestFire(ForestFireEntity forestFire);

    void removeForestFire(Long id);

    Optional<ForestFireEntity> findById(Long id);
}
