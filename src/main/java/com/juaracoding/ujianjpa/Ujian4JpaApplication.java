package com.juaracoding.ujianjpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.ujianjpa.entity.Admin;
import com.juaracoding.ujianjpa.entity.Dosen;
import com.juaracoding.ujianjpa.entity.Mahasiswa;
import com.juaracoding.ujianjpa.entity.MataKuliah;
import com.juaracoding.ujianjpa.entity.Nilai;
import com.juaracoding.ujianjpa.entity.Pertanyaan;
import com.juaracoding.ujianjpa.entity.Soal;
import com.juaracoding.ujianjpa.respository.AdminRespository;
import com.juaracoding.ujianjpa.respository.DosenRespository;
import com.juaracoding.ujianjpa.respository.MahasiswaRespository;
import com.juaracoding.ujianjpa.respository.MatakuliahRespository;
import com.juaracoding.ujianjpa.respository.NilaiRespository;
import com.juaracoding.ujianjpa.respository.PertanyaanRespository;
import com.juaracoding.ujianjpa.respository.SoalRespository;

@SpringBootApplication
public class Ujian4JpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Ujian4JpaApplication.class, args);
	}
	
	@Autowired
	AdminRespository adminRespository;
	
	@Autowired
	MatakuliahRespository mataKuliahRespository;
	
	@Autowired
	MahasiswaRespository mahasiswaRespository;
	
	@Autowired
	DosenRespository dosenRespository;
	
	@Autowired
	SoalRespository soalRespository;
	
	@Autowired
	PertanyaanRespository pertanyaanRespository;
	
	@Autowired
	NilaiRespository nilaiRespository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Cara add Admin
		/*
		Admin admin = new Admin();
		admin.setUsername("admin");
		admin.setPassword("admin");
		
		this.adminRespository.save(admin);
		*/
		
		// Cara add Mata Kuliah, Mahasiswa, dan Dosen
		/*
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNamaMahasiswa("Hafiz");
		mahasiswa.setJenisKelamin("Pria");
		mahasiswa.setPassword("12345");
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.setNamaMahasiswa("Lutfi");
		mahasiswa2.setJenisKelamin("Pria");
		mahasiswa2.setPassword("12346");
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setNamaMatakuliah("Java");
		
		MataKuliah matakuliah2 = new MataKuliah();
		matakuliah2.setNamaMatakuliah("Algoritma");
		
		MataKuliah matakuliah3 = new MataKuliah();
		matakuliah2.setNamaMatakuliah("C");
		
		Dosen dosen = new Dosen();
		dosen.setNamaDosen("NagaBonnar");
		dosen.setUsername("NB");
		dosen.setPassword("123456");
		
		Dosen dosen2 = new Dosen();
		dosen2.setNamaDosen("NyiRorong");
		dosen2.setUsername("NR");
		dosen2.setPassword("654321");
		
		Dosen dosen3 = new Dosen();
		dosen2.setNamaDosen("Pattimura");
		dosen2.setUsername("PM");
		dosen2.setPassword("1945");
		
		List<Dosen> lstdosen = new ArrayList<Dosen>();
		lstdosen.add(dosen);
		lstdosen.add(dosen2);
		matakuliah.setLstDosen(lstdosen);
		
		List<Dosen> lstdosen2 = new ArrayList<Dosen>();
		lstdosen2.add(dosen2);
		lstdosen2.add(dosen3);
		matakuliah2.setLstDosen(lstdosen2);
		
		List<Dosen> lstdosen3 = new ArrayList<Dosen>();
		lstdosen3.add(dosen3);
		lstdosen3.add(dosen);
		matakuliah3.setLstDosen(lstdosen3);
		
		List<MataKuliah> mk = new ArrayList<MataKuliah>();
		mk.add(matakuliah2);
		mk.add(matakuliah);
		mahasiswa.setMataKuliah(mk);
		
		List<MataKuliah> mk2 = new ArrayList<MataKuliah>();
		mk2.add(matakuliah2);
		mk.add(matakuliah3);
		mahasiswa2.setMataKuliah(mk);
		
		List<Mahasiswa> lstMahasiswa = new ArrayList<Mahasiswa>();
		lstMahasiswa.add(mahasiswa2);
		lstMahasiswa.add(mahasiswa);
		this.mahasiswaRespository.saveAll(lstMahasiswa);
		
		List<MataKuliah> lstmatkul = new ArrayList<MataKuliah>();
		lstmatkul.add(matakuliah3);
		lstmatkul.add(matakuliah2);
		lstmatkul.add(matakuliah);
		this.mataKuliahRespository.saveAll(lstmatkul);
		
		// cara add soal dan pertanyan
		Soal soal = new Soal();
		soal.setNamaSoal("Ujian");
		soal.setStatus(1);
		soal.setMataKuliah(matakuliah);
		
		
		Pertanyaan pertanyaan = new Pertanyaan();
		pertanyaan.setPertanyaan("apa");
		pertanyaan.setJawaban1("a");
		pertanyaan.setJawaban2("b");
		pertanyaan.setJawaban3("c");
		pertanyaan.setJawaban4("d");
		
		Pertanyaan pertanyaan2 = new Pertanyaan();
		pertanyaan2.setPertanyaan("apa");
		pertanyaan2.setJawaban1("a");
		pertanyaan2.setJawaban2("b");
		pertanyaan2.setJawaban3("c");
		pertanyaan2.setJawaban4("d");
		
		List<Pertanyaan> lstTanya = new ArrayList<Pertanyaan>();
		lstTanya.add(pertanyaan2);
		lstTanya.add(pertanyaan);
		
		soal.setLstPertanyaan(lstTanya);
		this.soalRespository.save(soal);
		
		Nilai nilai = new Nilai();
		nilai.setNilai(10);
		
		nilai.setMahasiswa(mahasiswa);
		nilai.setSoal(soal);
		this.nilaiRespository.save(nilai);
		*/
	}

}
