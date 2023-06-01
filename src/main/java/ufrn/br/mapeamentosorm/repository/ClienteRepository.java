package ufrn.br.mapeamentosorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.mapeamentosorm.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
