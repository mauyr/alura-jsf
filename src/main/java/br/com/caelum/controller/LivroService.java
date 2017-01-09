package br.com.caelum.controller;

import br.com.caelum.bean.Livro;

import javax.faces.bean.ManagedBean;

/**
 * Created by mauyr on 06/01/17.
 */

@ManagedBean
public class LivroService {

    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void gravar() {
        System.out.println("Gravando livro:" + this.livro.getTitulo());
    }
}
