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
    public void removeDepartment(String id) {
        departmentEntityRepository.delete(id);


    @Override
    public DepartmentEntity findById(String id) {
        return departmentEntityRepository.findById(id);
    }
}
