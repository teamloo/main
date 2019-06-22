package service;

import entity.DepartmentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DepartmentEntityManager {
    Page<DepartmentEntity> getAllDepartment(Pageable pageable);

    void saveDepartment(DepartmentEntity departmentEntity);

    void removeDepartment(String id);

    Optional<DepartmentEntity> findById(String id);
}

