package ufrn.br.mapeamentosorm.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String nome;

	/*
	//Caso 1
	@OneToOne(mappedBy = "cliente"/*, cascade = CascadeType.PERSIST)
	Endereco endereco;

	 */


	/*
	//Caso 2
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "endereco_id")
	Endereco endereco;

	 */


	/*
	//Caso 3
	@OneToOne(mappedBy = "cliente")
	Endereco endereco;

	 */

	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name ="endereco_id")
	Endereco endereco;
	 */


	/*
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
	List<Pedido> pedidos;

	 */

}
