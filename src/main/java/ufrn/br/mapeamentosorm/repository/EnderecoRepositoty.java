package tads.eaj.ufrn.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.loja.model.Endereco;

public interface EnderecoRepositoty extends JpaRepository<Endereco, Long> {
}
