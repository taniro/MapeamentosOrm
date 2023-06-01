package ufrn.br.mapeamentosorm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.mapeamentosorm.model.Cliente;
import ufrn.br.mapeamentosorm.model.Endereco;
import ufrn.br.mapeamentosorm.service.ClienteService;


import java.util.List;
import java.util.Optional;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private ClienteService service;

	public ClienteController(ClienteService service) {
		this.service = service;
	}

	@GetMapping
	public List<Cliente> listAll(){
		return service.getAll();
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Cliente> getOne(@PathVariable Long id){

		Optional<Cliente> clienteOptional = service.findById(id);

		if (clienteOptional.isEmpty()){
			return ResponseEntity.notFound().build();
		}else {


			Cliente cliente = clienteOptional.get();
			/*
			//mim mesmo
			cliente.add(linkTo(ClienteController.class).slash(id).withSelfRel());
			//para todos
			cliente.add(linkTo(ClienteController.class).withRel("allClientes"));

			Endereco endereco = cliente.getEndereco();

			endereco.add(linkTo(EnderecoController.class).slash(endereco.getId()).withSelfRel());
			endereco.add(linkTo(EnderecoController.class).withRel("allEnderecos"));

			 */

			return ResponseEntity.ok().body(cliente);
		}




		/*
		return service
				.findById(id)
				.map( record -> ResponseEntity.ok().body( record )).orElse(ResponseEntity.notFound().build());
		*/
		/*
		return service
				.findById(id)
				.map( record -> {
					return ResponseEntity.ok().body( record );
				}).orElse(ResponseEntity.notFound().build());
		 */

		/*
		Optional<Cliente> clienteOptional = service.findById(id);

		if (clienteOptional.isPresent()){
			return ResponseEntity.ok().body(clienteOptional.get());
		}else {
			return ResponseEntity.notFound().build();
		}*/

		//return service.findById(id).orElse(null);
	}


	/*
	POST -> CRIAR
	POST x -> 201 (0)
	POST x -> 201 (x)
	POST x -> 200 (x)
	 */

	@PostMapping
	public Cliente insert(@RequestBody Cliente c){
		return service.insert(c);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente c){
		return service
				.findById(id)
				.map( record -> {
					service.saveAndFlush(c);
					return ResponseEntity.ok().body(c);
				}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		return service
				.findById(id)
				.map( record -> {
					service.delete(record);
					return ResponseEntity.status(202).build();
				}).orElse(ResponseEntity.notFound().build());
	}
}
