package service;

import entity.UnitEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UnitEntityManager {
    Page<UnitEntity> getAllUnit(Pageable pageable);

    void saveUnit(UnitEntity unitEntity);

    void deleteUnit(String id);

    Optional<UnitEntity> findById(String id);
}
