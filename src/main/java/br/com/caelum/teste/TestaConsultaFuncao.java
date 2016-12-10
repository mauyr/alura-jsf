package br.com.caelum.teste;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;

/**
 * Created by MauyrAlexandre on 10/12/2016.
 */
public class TestaConsultaFuncao {

    public static void main(String[] args) {

        EntityManager manager = new JPAUtil().getEntityManager();

        MovimentacaoDao movimentacaoDao = new MovimentacaoDao(manager);

        Conta conta = new Conta();
        conta.setId(1);

        System.out.println("Media: " + movimentacaoDao.mediaDaConta(conta));
        System.out.println("Maior valor: " + movimentacaoDao.maiorValor(conta));
        System.out.println("Total movimentações: " + movimentacaoDao.totalMovimentacoes(conta));

        manager.close();
    }


}
