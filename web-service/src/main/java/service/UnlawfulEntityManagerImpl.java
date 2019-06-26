package service;

import entity.TreePlantedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

public class UnlawfulEntityManagerImpl implements UnlawfulEntityManager{
    @Autowired
    UnlawfulEntityRepository plantedEntityRepository;
    @Override
    public Page<TreePlantedEntity> getAllTreePlanted(Pageable pageable) {
        return plantedEntityRepository.findAll(pageable);
    }

    @Override
    public void saveTreePlanted(TreePlantedEntity treePlantedEntity) {
        plantedEntityRepository.save(treePlantedEntity);
    }

    @Override
    public void deleteTreePlanted(String id) {
        plantedEntityRepository.deleteById(id);
    }

    @Override
    public Optional<TreePlantedEntity> findById(String id) {
        return plantedEntityRepository.findById(id);
    }


}
