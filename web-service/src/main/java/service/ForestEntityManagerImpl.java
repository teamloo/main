package service;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ForestEntityRepository;

import java.util.Optional;

public class ForestEntityManagerImpl implements ForestEntityManager {
    @Autowired
    ForestEntityRepository forestEntityRepository;
    @Override
    public Page<ForestEntity> getAllForest(Pageable pageable) {
        return forestEntityRepository.findAll(pageable);
    }

    @Override
    public void saveForest(ForestEntity forest) {
        forestEntityRepository.save(forest);
    }

    @Override
    public void removeForest(String id) {
        forestEntityRepository.deleteById(id);
    }

    @Override
    public Optional<ForestEntity> findById(String id) {
        return forestEntityRepository.findById(id);
    }


}
