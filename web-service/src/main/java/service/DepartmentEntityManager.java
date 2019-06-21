package service;

import entity.DepartmentEntity;

public interface DepartmentEntityManager {
    Iterable<DepartmentEntity> getAllDepartment();

    void saveDepartment(DepartmentEntity departmentEntity);

    void removeDepartment(String id);

    DepartmentEntity findById(String id);
}

