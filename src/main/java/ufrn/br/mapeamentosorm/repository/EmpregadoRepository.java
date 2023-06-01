package tads.eaj.ufrn.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.loja.model.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
}
