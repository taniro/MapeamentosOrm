package ufrn.br.mapeamentosorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.mapeamentosorm.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
