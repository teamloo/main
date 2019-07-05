package service.Impl;

import entity.ForestFireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ForestFireEntityRepository;
import service.ForestFireEntityManager;

import java.util.Optional;

public class ForestFireEntityManagerImpl  implements ForestFireEntityManager {
    @Autowired
    ForestFireEntityRepository forestFireEntityRepository;
    @Override
    public Page<ForestFireEntity> getAllForestFire(Pageable pageable) {
        return forestFireEntityRepository.findAll(pageable);
    }

    @Override
    public void saveForestFire(ForestFireEntity forestFireEntity) {
        forestFireEntityRepository.save(forestFireEntity);
    }

    @Override
    public void removeForestFire(Long id) {
        forestFireEntityRepository.deleteById(id);
    }

    @Override
    public Optional<ForestFireEntity> findById(Long id) {
        return forestFireEntityRepository.findById(id);
    }

}
