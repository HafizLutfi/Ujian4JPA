package com.juaracoding.ujianjpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pertanyaan")
public class Pertanyaan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPertanyaan;
	private String pertanyaan;
	private String jawaban1;
	private String jawaban2;
	private String jawaban3;
	private String jawaban4;
	@Column(name="jawaban_benar")
	private String jawabanBenar;
	@Column(name="status_gambar")
	private int statusGambar;
	
	
}
