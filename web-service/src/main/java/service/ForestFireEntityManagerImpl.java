package service;

import entity.ForestFireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ForestFireEntityRepository;

import java.util.Optional;

public class ForestFireEntityManagerImpl  implements ForestFireEntityManager{
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
    public void removeForestFire(String id) {
        forestFireEntityRepository.delete(id);
    }

    @Override
    public ForestFireEntity findById(String id) {
        return forestFireEntityRepository.findOne(id);
    }

}
