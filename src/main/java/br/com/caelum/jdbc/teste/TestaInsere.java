package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.model.dao.ContatoDao;
import br.com.caelum.model.entities.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Impa");
		contato.setEmail("impa@email.com.br");
		contato.setEndereco("Rua Bauzinho, 987");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adicionaContato(contato);
		
		System.out.println("Contato gravado com sucesso!");
	}

}
