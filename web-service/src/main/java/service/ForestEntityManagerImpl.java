package service;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ForestEntityRepository;

public class ForestEntityManagerImpl implements ForestEntityManager {
    @Autowired
    ForestEntityRepository forestEntityRepository;
    @Override
    public Iterable<ForestEntity> getAllForest() {
        return forestEntityRepository.findAll();
    }

    @Override
    public void saveForest(ForestEntity forest) {
        forestEntityRepository.save(forest);
    }



    @Override
    public void removeForest(ForestEntity forest) {
        forestEntityRepository.delete(forest);
    }
}
