package tads.eaj.ufrn.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
