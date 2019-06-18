package repository;

import entity.TreePlantedEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TreePlantedEntityRepository extends JpaRepository<TreePlantedEntity, String> {

}
