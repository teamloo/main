package service.Impl;

import entity.ForestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ForestEntityRepository;
import service.ForestEntityManager;

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
    public void removeForest(Long id) {
        forestEntityRepository.deleteById(id);
    }

    @Override
    public Optional<ForestEntity> findById(Long id) {
        return forestEntityRepository.findById(id);
    }


}
