package repository;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UnitEntityRepository extends PagingAndSortingRepository<UnitEntity, Long> {
    List<DepartmentEntity> findAllByNameContaining(String unitName);
//    UnitEntity findById(String id);
}
