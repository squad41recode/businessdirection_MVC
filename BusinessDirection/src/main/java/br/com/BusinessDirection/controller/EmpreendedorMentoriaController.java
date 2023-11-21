package br.com.BusinessDirection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.BusinessDirection.model.EmpreendedorMentoria;
import br.com.BusinessDirection.repository.EmpreendedorMentoriaRepository;
import br.com.BusinessDirection.repository.EmpreendedorRepository;
import br.com.BusinessDirection.repository.MentorModalidadeRepository;

@Controller
@RequestMapping("/mentorias-adquiridas")
public class EmpreendedorMentoriaController {

	@Autowired
	private EmpreendedorMentoriaRepository empreendedorMentoriaRepository;

	@Autowired
	private MentorModalidadeRepository mentorModalidadeRepository;

	@Autowired
	private EmpreendedorRepository empreendedorRepository;

	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("crudEmpreendedorMentoria/index");
		modelAndView.addObject("EmpreendedorMentorias", empreendedorMentoriaRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/{id}")
	public ModelAndView detalhes(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudEmpreendedorMentoria/detalhes");
		modelAndView.addObject("empreendedorMentoria", empreendedorMentoriaRepository.getReferenceById(id));

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("crudEmpreendedorMentoria/formulario");
		modelAndView.addObject("empreendedorMentoria", new EmpreendedorMentoria());
		modelAndView.addObject("mentoriasDisponiveis", mentorModalidadeRepository.findAll());
		modelAndView.addObject("empreendedores", empreendedorRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudEmpreendedorMentoria/formulario");
		modelAndView.addObject("empreendedorMentoria", empreendedorMentoriaRepository.getReferenceById(id));
		modelAndView.addObject("mentoriasDisponiveis", mentorModalidadeRepository.findAll());
		modelAndView.addObject("empreendedores", empreendedorRepository.findAll());

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(EmpreendedorMentoria empreendedorMentoria, RedirectAttributes redirectAttributes) {
		try {
			empreendedorMentoriaRepository.save(empreendedorMentoria);
		} catch (DataIntegrityViolationException e) {

			redirectAttributes.addFlashAttribute("alertMessage",
					"Mentoria indisponível para o empreendedor selecionado.");
			return "redirect:/mentorias-adquiridas/cadastrar";

		}

		return "redirect:/mentorias-adquiridas";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		empreendedorMentoriaRepository.deleteById(id);

		return "redirect:/mentorias-adquiridas";
	}
}
