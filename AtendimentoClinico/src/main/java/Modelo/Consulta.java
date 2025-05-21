/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author atila
 */
public class Consulta {
     private int id;
    private int idPaciente;
    private int idMedico;
    private Date data;
    private Time hora;
    private String observacao;

    public Consulta() {
    }

    public Consulta(int id, int idPaciente, int idMedico, Date data, Time hora, String observacao) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

    public Consulta(Date data, Time hora, String observacao) {
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", idPaciente=" + idPaciente + ", idMedico=" + idMedico + ", data=" + data + ", hora=" + hora + ", observacao=" + observacao + '}';
    }
    
    
    
    
}
