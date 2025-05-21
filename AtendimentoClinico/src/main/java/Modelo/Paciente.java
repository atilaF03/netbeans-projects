/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author atila
 */
public class Paciente {
     private int id; 
    private String nome,cpf ,telefone , Relatorio; 

    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf, String telefone, String Relatorio) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.Relatorio = Relatorio;
    }

    public Paciente(String nome, String cpf, String telefone, String Relatorio) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.Relatorio = Relatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRelatorio() {
        return Relatorio;
    }

    public void setRelatorio(String Relatorio) {
        this.Relatorio = Relatorio;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", Relatorio=" + Relatorio + '}';
    }
  
}
