
/*document.addEventListener('DOMContentLoaded', function() {
	var form = document.querySelector('form');

	form.addEventListener('submit', function(event) {
		event.preventDefault();

		var mentorModalidadeSelect = form.querySelector('[th:field="*{mentorModalidade}"]');
		var empreendedorSelect = form.querySelector('[th:field="*{empreendedor}"]');

		var mentorModalidadeValue = mentorModalidadeSelect.value;
		var empreendedorValue = empreendedorSelect.value;

		// checa se os valores selecionados nao estao vazios
		if (mentorModalidadeValue && empreendedorValue) {
			// checa se os valores selecionados sao unicos
			if (mentorModalidadeValue !== empreendedorValue) {
				// se sao unicos, submit
				form.submit();
			} else {
				alert('Selecione outro valor pra empreendedor ou mentoria.');
			}
		} else {
			alert('Por favor, preencha todos os campos.');
		}

	});
});
*/