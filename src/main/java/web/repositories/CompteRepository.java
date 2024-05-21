package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.models.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
}
