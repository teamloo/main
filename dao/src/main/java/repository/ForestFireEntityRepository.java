package repository;

import entity.ForestFireEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ForestFireEntityRepository extends PagingAndSortingRepository<ForestFireEntity, Long> {
//    ForestFireEntity findById(String id);
}
