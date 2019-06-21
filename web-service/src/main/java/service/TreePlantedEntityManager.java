package service;

import entity.TreePlantedEntity;
import model.TreePlanted;

import java.util.List;

public interface TreePlantedEntityManager {
    Iterable<TreePlantedEntity> getAllTreePlanted();

    void saveTreePlanted(TreePlantedEntity treePlantedEntity);

    void deleteTreePlanted(TreePlantedEntity treePlantedEntity);
}
