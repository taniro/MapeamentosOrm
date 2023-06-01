package tads.eaj.ufrn.loja.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tads.eaj.ufrn.loja.model.Cliente;
import tads.eaj.ufrn.loja.model.Endereco;
import tads.eaj.ufrn.loja.service.EnderecoService;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	private EnderecoService service;

	public EnderecoController(EnderecoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Endereco> listAll(){
		return service.getAll();
	}

	@GetMapping (path = "/{id}")
	public ResponseEntity<Endereco> getOne(@PathVariable Long id){

		Optional<Endereco> optionalEndereco = service.findById(id);

		if (optionalEndereco.isEmpty()){
			return ResponseEntity.notFound().build();
		}


		Endereco endereco = optionalEndereco.get();
		/*
		endereco.add(linkTo(EnderecoController.class).slash(id).withSelfRel());
		endereco.add(linkTo(EnderecoController.class).withRel("all-endereco"));

		 */

		return ResponseEntity.ok().body(endereco);
	}

	@PostMapping
	public Endereco insert(@RequestBody Endereco e){
		return service.insert(e);
	}
}
