package service;

import entity.TreePlantedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TreePlantedEntityRepository;

public class TreePlantedManagerImpl implements TreePlantedEntityManager{
    @Autowired
    TreePlantedEntityRepository plantedEntityRepository;
    @Override
    public Iterable<TreePlantedEntity> getAllTreePlanted() {
        return plantedEntityRepository.findAll();
    }

    @Override
    public void saveTreePlanted(TreePlantedEntity treePlantedEntity) {
        plantedEntityRepository.save(treePlantedEntity);
    }

    @Override
    public void deleteTreePlanted(String id) {
        plantedEntityRepository.delete(id);
    }

    @Override
    public TreePlantedEntity findById(String id) {
        return plantedEntityRepository.findById(id);
    }


}
