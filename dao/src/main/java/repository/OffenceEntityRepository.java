package repository;

import entity.OffenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffenceEntityRepository extends JpaRepository<OffenceEntity, Long> {
}
