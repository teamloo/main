package service;

import entity.TreePlantedEntity;
import model.TreePlanted;

import java.util.List;

public interface TreePlantedEntityManager {
    public Iterable<TreePlantedEntity> getAllTreePlanted();
}
