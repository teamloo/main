package service;

import entity.OffenceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.OffenceEntityRepository;

import java.util.Optional;

public class OffenceEntityManagerImpl implements OffenceEntityManager {
    @Autowired
    OffenceEntityRepository offenceEntityRepository;
    @Override
    public Page<OffenceEntity> getAllOffence(Pageable pageable) {
        return offenceEntityRepository.findAll(pageable);
    }

    @Override
    public void saveOffence(OffenceEntity offence) {
        offenceEntityRepository.save(offence);
    }

    @Override
    public void removeOffence(String id) {
        offenceEntityRepository.deleteById(id);
    }

    @Override
    public Optional<OffenceEntity> findById(String id) {
        return offenceEntityRepository.findById(id);
    }

}
