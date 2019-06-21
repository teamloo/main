package service;

import entity.OffenceEntity;

public interface OffenceEntityManager {
    Iterable<OffenceEntity> getAllOffence();

    void saveOffence(OffenceEntity offenceEntity);

    void removeOffence(String id);

    OffenceEntity findById(String id);
}
