/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro.controle;

import com.mycompany.cadastro.dao.PessoaDAO;
import com.mycompany.cadastro.modelo.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaControle {
    private PessoaDAO dao = new PessoaDAO();

    public void cadstrar(String nome, int idade) {
        Pessoa p = new Pessoa(nome, idade);
        dao.inserir(p);
    }
    
    public ArrayList<Pessoa> listar() {
        return dao.listar();
    }
    
    public void atualizar(int id, String nome, int idade) {
        Pessoa p = new Pessoa(id, nome, idade);
        dao.atualizar(p);
    }
    
    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Pessoa> bscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }
}
