package br.com.BusinessDirection.controller;

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
		modelAndView.addObject("ConteudoEmpreendedor", conteudoEmpreendedorRepository.findAll());

		return modelAndView;
	}

	// TERMINAR TODOS OS RELACIOMENTOS DA CLASSE EMPREENDEDOR
	@GetMapping("/{id}")
	public ModelAndView detalhes(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/detalhes");
		modelAndView.addObject("ConteudoEmpreendedor", conteudoEmpreendedorRepository.getReferenceById(id));

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/formulario");
		modelAndView.addObject("conteudoOnline", new ConteudoOnline());
		modelAndView.addObject("Empreendedor",  empreendedorRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudConteudoEmpreendedor/formulario");
		modelAndView.addObject("conteudoEmpreendedor", conteudoEmpreendedorRepository.getReferenceById(id));

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(ConteudoEmpreendedor empreeendedorConteudo) {
		conteudoEmpreendedorRepository.save(empreeendedorConteudo);

		return "redirect:/conteudo-estudado";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		conteudoOnlineRepository.deleteById(id);

		return "redirect:/conteudo-estudado";
	}
}
