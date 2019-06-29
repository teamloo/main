package repository;

import entity.DepartmentEntity;
import entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DepartmentEntityRepository extends PagingAndSortingRepository<DepartmentEntity, String> {

//    DepartmentEntity findById(String id);

    List<DepartmentEntity> findAllByUnit(UnitEntity unitEntity);
}
