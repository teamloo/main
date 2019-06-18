package repository;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentEntityRepository extends JpaRepository<DepartmentEntity, Long> {
    public DepartmentEntity findById(String departmentId);

    public List<DepartmentEntity> findAllByUnit(UnitEntity unitEntity);
}
