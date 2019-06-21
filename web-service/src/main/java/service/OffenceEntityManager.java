package service;

import entity.OffenceEntity;

public interface OffenceEntityManager {
    Iterable<OffenceEntity> getAllOffence();

    void saveOffence(OffenceEntity offenceEntity);

    void removeOffence(OffenceEntity offenceEntity);
}
