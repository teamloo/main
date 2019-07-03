package repository;

import entity.OffenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OffenceEntityRepository extends PagingAndSortingRepository<OffenceEntity, Long> {
//    OffenceEntity findById(String id);
}
