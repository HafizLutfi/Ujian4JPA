package com.juaracoding.ujianjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nim;
	@NotNull
	@Column(name="nama_mahasiswa")
	private String namaMahasiswa;
	@NotNull
	@Column(name="jenis_kelamin")
	private String jenisKelamin;
	@NotNull
	private String password;
	
	@ManyToMany(mappedBy = "lstMahasiswa")
	List <MataKuliah> mataKuliah = new ArrayList<MataKuliah>();

}
