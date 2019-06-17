package repository;


import model.Forest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForestRepository extends JpaRepository<Forest, String> {
}
