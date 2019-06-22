package service;

import entity.DepartmentEntity;

public interface DepartmentEntityManager {
    Iterable<DepartmentEntity> getAllDepartment();

    void saveDepartment(DepartmentEntity departmentEntity);

    void removeDepartment(DepartmentEntity departmentEntity);

    DepartmentEntity findById(String id);
}

