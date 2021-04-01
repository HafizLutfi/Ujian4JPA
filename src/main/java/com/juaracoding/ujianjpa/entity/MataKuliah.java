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
import javax.persistence.JoinTable;
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
@Table(name="mata_kuliah")
public class MataKuliah {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mata_kuliah")
	private long idMatakuliah;
	@NotNull
	@Column(name="nama_mata_kuliah")
	private String namaMatakuliah;
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="plot_mata_kuliah",
	joinColumns = 
	{@JoinColumn(name = "id_mata_kuliah", referencedColumnName = "id_mata_kuliah",
	nullable = false, updatable = false)},
	inverseJoinColumns = 
	{@JoinColumn(name ="id_dosen", referencedColumnName = "id_dosen",
	nullable = false, updatable = false)})
	
	List<Dosen> lstDosen = new ArrayList<Dosen>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="plot_mata_kuliah",
	joinColumns = 
	{@JoinColumn(name = "id_mata_kuliah", referencedColumnName = "id_mata_kuliah",
	nullable = false, updatable = false)},
	inverseJoinColumns = 
	{@JoinColumn(name ="nim", referencedColumnName = "nim",
	nullable = false, updatable = false)})
	
	List<Mahasiswa> lstMahasiswa = new ArrayList<Mahasiswa>();
}
