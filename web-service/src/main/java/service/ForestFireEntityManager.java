package service;

import entity.ForestFireEntity;

public interface ForestFireEntityManager {
    Iterable<ForestFireEntity> getAllForestFire();

    void saveForestFire(ForestFireEntity forestFire);

    void removeForestFire(String id);

    ForestFireEntity findByid(String id);
}
