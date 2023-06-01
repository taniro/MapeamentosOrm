package ufrn.br.mapeamentosorm.service;

import org.springframework.stereotype.Service;
import ufrn.br.mapeamentosorm.model.Cliente;
import ufrn.br.mapeamentosorm.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

	private ClienteRepository repository;

	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}

	public Cliente insert(Cliente c){
		return repository.save(c);
	}

	public Cliente update(Cliente c){
		return repository.save(c);
	}

	public void delete (Cliente c){
		repository.deleteById(c.getId());
	}

	public Cliente getOne(Long id){
		return repository.findById(id).orElse(null);
	}

	public Cliente saveAndFlush(Cliente c){
		return repository.saveAndFlush(c);
	}

	public Optional<Cliente> findById(Long id){
		return repository.findById(id);
	}

	public List<Cliente> getAll (){
		return repository.findAll();
	}
}
