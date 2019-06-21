package service;

import entity.TreePlantedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TreePlantedEntityRepository;

import java.util.List;

public class TreePlantedManagerImpl implements TreePlantedEntityManager{
    @Override
    public Iterable<TreePlantedEntity> getAllTreePlanted() {
        return addEntity.findAll();
    }

    @Autowired
    TreePlantedEntityRepository addEntity;


}
