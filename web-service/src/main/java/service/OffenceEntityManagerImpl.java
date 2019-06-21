package service;

import entity.OffenceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.OffenceEntityRepository;

public class OffenceEntityManagerImpl implements OffenceEntityManager {
    @Autowired
    OffenceEntityRepository offenceEntityRepository;
    @Override
    public Iterable<OffenceEntity> getAllOffence() {
        return offenceEntityRepository.findAll();
    }

    @Override
    public void saveOffence(OffenceEntity offence) {
        offenceEntityRepository.save(offence);
    }

    @Override
    public void removeOffence(String id) {
        offenceEntityRepository.delete(id);
    }

    @Override
    public OffenceEntity findById(String id) {
        return offenceEntityRepository.findById(id);
    }

}
