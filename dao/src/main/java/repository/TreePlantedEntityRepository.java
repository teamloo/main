package repository;

import entity.TreePlantedEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TreePlantedEntityRepository extends PagingAndSortingRepository<TreePlantedEntity, Long> {
//        TreePlantedEntity findById(String id);
}
