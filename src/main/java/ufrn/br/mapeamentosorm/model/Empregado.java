package ufrn.br.mapeamentosorm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nome;

	/*
	@OneToOne
	@JoinColumn(name = "chefe_id")
	Empregado chefe;

	 */
}
