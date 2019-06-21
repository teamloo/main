package repository;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DepartmentEntityRepository extends PagingAndSortingRepository<DepartmentEntity, Long> {
    DepartmentEntity findById(String departmentId);

     List<DepartmentEntity> findAllByUnit(UnitEntity unitEntity);
}
