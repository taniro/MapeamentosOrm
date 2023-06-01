package ufrn.br.mapeamentosorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.mapeamentosorm.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
