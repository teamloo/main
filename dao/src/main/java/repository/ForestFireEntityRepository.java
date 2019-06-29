package repository;

import entity.ForestFireEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ForestFireEntityRepository extends PagingAndSortingRepository<ForestFireEntity, String> {
//    ForestFireEntity findById(String id);
}
