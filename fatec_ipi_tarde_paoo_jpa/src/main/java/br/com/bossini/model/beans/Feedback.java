package br.com.bossini.model.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_feedback")
public class Feedback {
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	public Long getId() {
		return id;
	}
	
	@OneToMany (mappedBy = "feedback", cascade = CascadeType.ALL)
	private List <Consumo> consumos;
	
	public List<Consumo> getConsumos() {
		return consumos;
	}
	
	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
