package repository;


import entity.UnlawfulEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UnlawfulEntityRepository extends PagingAndSortingRepository<UnlawfulEntity, Long> {

}
