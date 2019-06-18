package repository;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitEntityRepository extends JpaRepository<DepartmentEntity, Long> {
    public List<DepartmentEntity> findAllByNameContaining(String unitName);
}
