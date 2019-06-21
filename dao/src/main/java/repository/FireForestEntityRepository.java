package repository;

import entity.FireForestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FireForestEntityRepository extends PagingAndSortingRepository<FireForestEntity, Long> {
}
