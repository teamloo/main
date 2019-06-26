package service;

import entity.ForestEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ForestEntityManager {
    Page<ForestEntity> getAllForest(Pageable pageable);

    void saveForest(ForestEntity forest);

    void removeForest(String id);

    ForestEntity findById(String id);
}
