package repository;

import entity.UnitEntity;
import entity.UnlawfulEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UnlawfulEntityRepository  extends PagingAndSortingRepository<UnlawfulEntity, String> {
}
