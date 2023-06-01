package tads.eaj.ufrn.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.loja.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
