package br.com.BPWBrasil.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Membro {
	
	private String nome;
	private int id;
	
	public Membro() {
		// TODO Auto-generated constructor stub
	}
	
	public Membro(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
