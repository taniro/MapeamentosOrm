package tads.eaj.ufrn.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.loja.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
