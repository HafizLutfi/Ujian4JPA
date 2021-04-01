package com.juaracoding.ujianjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="soal")
public class Soal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_soal")
	private long idSoal;
	@NotNull
	@Column(name="nama_soal")
	private String namaSoal;
	@NotNull
	private int status;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_mata_kuliah")
	private MataKuliah mataKuliah;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_mataKuliah", referencedColumnName = "id_mataKuliah")
	List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
	
}
