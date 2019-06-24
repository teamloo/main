package service;

import entity.UnitEntity;
import entity.UnlawfulEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.UnitEntityRepository;
import repository.UnlawfullEntityRepository;

import java.util.Optional;

public class UnlawfulEntityManagerImpl implements UnlawfulEntityManager {

    @Autowired
    UnlawfullEntityRepository unlawfullEntityRepository;

    @Override
    public Page<UnlawfulEntity> getAllUnlawful(Pageable pageable) {
        return unlawfullEntityRepository.findAll(pageable);
    }

    @Override
    public void saveUnlawful(UnlawfulEntity unlawfulEntity) {
        unlawfullEntityRepository.save(unlawfulEntity);
    }

    @Override
    public void deleteUnlawful(String id) {
        unlawfullEntityRepository.deleteById(id);
    }

    @Override
    public Optional<UnlawfulEntity> findById(String id) {
        return unlawfullEntityRepository.findById(id);
    }

}
