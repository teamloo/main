package service;

import entity.UnitEntity;
import entity.UnlawfulEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.UnitEntityRepository;

import java.util.Optional;

public class UnitEntityManagerImpl implements  UnitEntityManager {
   @Autowired
   private UnitEntityRepository unitEntityRepository;

    @Override
    public Page<UnitEntity> getAllUnit(Pageable pageable) {
        return unitEntityRepository.findAll(pageable);
    }

    @Override
    public void saveUnit(UnitEntity unitEntity) {
        unitEntityRepository.save(unitEntity);
    }

    @Override
    public void deleteUnit(String id) {
        unitEntityRepository.delete(id);
    }

    @Override
    public UnitEntity findById(String id) {
        return unitEntityRepository.findOne(id);
    }
}
