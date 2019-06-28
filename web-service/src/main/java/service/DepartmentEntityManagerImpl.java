package service;

import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.DepartmentEntityRepository;

import java.util.Optional;

public class DepartmentEntityManagerImpl implements DepartmentEntityManager {
    @Autowired
    DepartmentEntityRepository departmentEntityRepository;

    @Override
    public Page<DepartmentEntity> getAllDepartment(Pageable pageable) {
        return departmentEntityRepository.findAll(pageable);

    }

    @Override
    public void saveDepartment(DepartmentEntity department) {
        departmentEntityRepository.save(department);
    }


    @Override
    public void removeDepartment(String id) {
        departmentEntityRepository.delete(id);
    }

    @Override
    public Optional<DepartmentEntity> findById(String id) {
        return departmentEntityRepository.findById(id);
    }
}
