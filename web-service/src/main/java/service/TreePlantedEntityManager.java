package service;

import entity.TreePlantedEntity;
import model.TreePlanted;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TreePlantedEntityManager {
    Page<TreePlantedEntity> getAllTreePlanted(Pageable pageable);

    void saveTreePlanted(TreePlantedEntity treePlantedEntity);

    void deleteTreePlanted(Long id);

    Optional<TreePlantedEntity> findById(Long id);
}
