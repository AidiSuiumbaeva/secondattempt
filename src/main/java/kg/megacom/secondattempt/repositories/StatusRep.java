package kg.megacom.secondattempt.repositories;

import kg.megacom.secondattempt.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRep extends JpaRepository<Status,Long> {
}
