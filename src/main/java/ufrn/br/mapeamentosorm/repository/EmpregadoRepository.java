package ufrn.br.mapeamentosorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.mapeamentosorm.model.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
}
