package com.cgac.pastoral.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projeto  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    private Long id;
    private String titulo;
    private String subTitulo;
    private String responsavel;
    private String professor;
    private String horario;
    private int numParticipantes;
    private BigDecimal orcamento;
    
    public Projeto  () {
    	
    }
    
    
	public Projeto(Long id, String titulo, String subTitulo, String responsavel, String professor, String horario,
			int numParticipantes, BigDecimal orcamento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.responsavel = responsavel;
		this.professor = professor;
		this.horario = horario;
		this.numParticipantes = numParticipantes;
		this.orcamento = orcamento;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubTitulo() {
		return subTitulo;
	}
	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getNumParticipantes() {
		return numParticipantes;
	}
	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}
	public BigDecimal getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(BigDecimal orcamento) {
		this.orcamento = orcamento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
}
