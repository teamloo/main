package service;

import entity.ForestFireEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ForestFireEntityRepository;

public class ForestFireEntityManagerImpl  implements ForestFireEntityManager{
    @Autowired
    ForestFireEntityRepository forestFireEntityRepository;
    @Override
    public Iterable<ForestFireEntity> getAllForestFire() {
        return forestFireEntityRepository.findAll();
    }

    @Override
    public void saveForestFire(ForestFireEntity forestFireEntity) {
        forestFireEntityRepository.save(forestFireEntity);
    }



    @Override
    public void removeForestFire(ForestFireEntity forestFireEntity) {
        forestFireEntityRepository.delete(forestFireEntity);
    }
}
