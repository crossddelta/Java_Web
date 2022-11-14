package br.com.caelum.mvc.logica;

import br.com.caelum.model.dao.ContatoDao;
import br.com.caelum.model.entities.Contato;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveContatoLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.removeContato((int)id);
		
	    System.out.println("Excluindo contato... ");
	      
	    return "mvc?logica=ListaContatosLogica";
	}

}
