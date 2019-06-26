package service;

import entity.OffenceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OffenceEntityManager {
    Page<OffenceEntity> getAllOffence(Pageable pageable);

    void saveOffence(OffenceEntity offenceEntity);

    void removeOffence(String id);

    OffenceEntity findById(String id);
}
