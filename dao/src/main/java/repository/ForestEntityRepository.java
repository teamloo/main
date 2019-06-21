package repository;


import entity.ForestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ForestEntityRepository extends PagingAndSortingRepository<ForestEntity, String> {


}
