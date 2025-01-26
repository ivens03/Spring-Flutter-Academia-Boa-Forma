package academia.SpringBoaForma.repositories;

import academia.SpringBoaForma.models.alunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface alunoRepository extends JpaRepository<alunoModel, UUID> {
}
