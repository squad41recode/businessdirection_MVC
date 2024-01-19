package br.com.BusinessDirection.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.BusinessDirection.model.ConteudoEmpreendedor;
import br.com.BusinessDirection.model.ConteudoOnline;
import br.com.BusinessDirection.model.Empreendedor;
import br.com.BusinessDirection.repository.ConteudoEmpreendedorRepository;
import br.com.BusinessDirection.repository.ConteudoOnlineRepository;
import br.com.BusinessDirection.repository.EmpreendedorRepository;

@Controller
@RequestMapping("/conteudo-estudado")
public class ConteudoEmpreendedorController {

	@Autowired
	private ConteudoOnlineRepository conteudoOnlineRepository;

	@Autowired
	private EmpreendedorRepository empreendedorRepository;

	@Autowired
	private ConteudoEmpreendedorRepository conteudoEmpreendedorRepository;

	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/index");
		modelAndView.addObject("conteudosEmpreendedor", conteudoEmpreendedorRepository.findAllAtivos());

		return modelAndView;
	}

	// TERMINAR TODOS OS RELACIOMENTOS DA CLASSE EMPREENDEDOR
	@GetMapping("/{id}")
	public ModelAndView detalhes(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/detalhes");
		modelAndView.addObject("conteudoEmpreendedor", conteudoEmpreendedorRepository.findByIdAndAtivo(id, true));

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/formulario");

		List<Empreendedor> empreendedores = empreendedorRepository.findAll();
		List<ConteudoOnline> conteudosOnline = conteudoOnlineRepository.findAll();

		modelAndView.addObject("conteudosOnline", conteudosOnline);
		modelAndView.addObject("empreendedores", empreendedores);
		modelAndView.addObject("conteudoEmpreendedor", new ConteudoEmpreendedor());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/formulario");

		List<Empreendedor> empreendedores = empreendedorRepository.findAll();
		List<ConteudoOnline> conteudosOnline = conteudoOnlineRepository.findAll();

		modelAndView.addObject("conteudosOnline", conteudosOnline);
		modelAndView.addObject("empreendedores", empreendedores);
		modelAndView.addObject("conteudoEmpreendedor", conteudoEmpreendedorRepository.getReferenceById(id));

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(ConteudoEmpreendedor conteudoEmpreendedor) {
		conteudoEmpreendedor.setAtivo(true);
		conteudoEmpreendedorRepository.save(conteudoEmpreendedor);

		return "redirect:/conteudo-estudado";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		// conteudoOnlineRepository.deleteById(id);
		Optional<ConteudoEmpreendedor> conteudoEmpreendedorOptional = conteudoEmpreendedorRepository.findById(id);
		conteudoEmpreendedorOptional.ifPresent(conteudoEmpreendedor -> {
			conteudoEmpreendedor.setAtivo(false);
			conteudoEmpreendedorRepository.save(conteudoEmpreendedor);
		});

		return "redirect:/conteudo-estudado";
	}
}
