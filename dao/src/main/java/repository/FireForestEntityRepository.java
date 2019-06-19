package repository;

import entity.FireForestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireForestEntityRepository extends JpaRepository<FireForestEntity, Long> {
}
