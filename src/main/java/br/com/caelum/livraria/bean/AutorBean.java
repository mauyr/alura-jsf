package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.model.Autor;
import br.com.caelum.livraria.model.Livro;
import br.com.caelum.livraria.util.RedirectView;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class AutorBean {

	private Autor autor = new Autor();

	public Autor getAutor() {
		return autor;
	}

	public RedirectView gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		if (this.autor.getId()==null) {
			new DAO<>(Autor.class).adiciona(this.autor);
		} else {
			new DAO<>(Autor.class).atualiza(this.autor);
		}

		return new RedirectView("livro");
	}

	public void carregar(Autor autor) {
		System.out.println("Carregando autor" + autor.getNome());
		this.autor = autor;
	}

	public void remover(Autor autor) {
		System.out.println("Removendo autor" + autor.getNome());
		new DAO<>(Autor.class).remove(autor);
	}

	public List<Autor> getAutores() {
		return new DAO<>(Autor.class).listaTodos();
	}
}
