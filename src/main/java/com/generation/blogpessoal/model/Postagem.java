package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//modelar o atributo e a tabela postagens no banco de dados
@Entity
@Table(name="tb_postagens")
public class Postagem {
	
	@Id //tornar esse atributo uma chave primária do db
	@GeneratedValue(strategy=GenerationType.IDENTITY) // add id como auto increment
	private long id;
	
	//essa anotação valida o atributo tendo um valor máximo e minimo de caracteres
	@Size(min = 5, max = 100, message = "O título deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo título é obrigatório")
	private String titulo;
	
	@Size(min = 5, max = 1000, message = "O texto deve ter no mínimo 5 caracteres e no máximo 1000")
	@NotBlank(message = "Atributo texto é obrigatório")
	private String texto;
	
	@UpdateTimestamp //pega data do sistema ao cadastrar o registro
	private LocalDateTime data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	
}
