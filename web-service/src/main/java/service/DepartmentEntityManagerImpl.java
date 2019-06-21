package service;

import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.DepartmentEntityRepository;

public class DepartmentEntityManagerImpl implements DepartmentEntityManager {
    @Autowired
    DepartmentEntityRepository departmentEntityRepository;

    @Override
    public Iterable<DepartmentEntity> getAllDepartment() {
        return departmentEntityRepository.findAll();
    }

    @Override
    public void saveDepartment(DepartmentEntity department) {
        departmentEntityRepository.save(department);
    }


    @Override
    public void removeDepartment(DepartmentEntity department) {
        departmentEntityRepository.delete(department);
    }
}
