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
@Table(name="dosen")
public class Dosen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_dosen;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@Column(name = "nama_dosen")
	private String namaDosen;
	
	@ManyToMany(mappedBy = "lstDosen")
	List<MataKuliah> mataKuliah = new ArrayList<MataKuliah>();
}
