package service;

import entity.ForestEntity;

public interface ForestEntityManager {
    Iterable<ForestEntity> getAllForest();

    void saveForest(ForestEntity forest);

    void removeForest(ForestEntity forest);
}
