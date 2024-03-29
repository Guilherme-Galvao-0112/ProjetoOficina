/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "Cargo")
public class Cargo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;
    private String Nome;
    private Float Salario;
    private Float Comissao;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public Float getSalario() {
        return Salario;
    }

    public void setSalario(Float Salario) {
        this.Salario = Salario;
    }

    public Float getComissao() {
        return Comissao;
    }

    public void setComissao(Float Comissao) {
        this.Comissao = Comissao;
    }

  
}
