package ufrn.br.mapeamentosorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.mapeamentosorm.model.Endereco;

public interface EnderecoRepositoty extends JpaRepository<Endereco, Long> {
}
