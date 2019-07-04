package com.Eksad.latihanjdbc;

import java.util.Scanner;

import com.Eksad.latihanjdbc.model.Employee;

public class Application {
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Pilih Angka : ");
	  	System.out.println("1. Tampilkan Data Karyawan");
	  	System.out.println("2. Cari Karyawan");
	  	System.out.println("3. Input Karyawan");
	  	
	  	String angkaTerpilih = scan.nextLine();
	  	
		
	  	if (angkaTerpilih.equals("1")) {
	  		employeeService.getAll();
	  	} else if (angkaTerpilih.equals("2")) {
	  		System.out.println("Masukan Nama : ");
	  		String inputNama = scan.nextLine();
	  		employeeService.getByName(inputNama);
	  		
	  	} else if (angkaTerpilih.equals("3")) {
	    	
	    	Employee employee1 = new Employee();
	    	
	    	
	    	System.out.println("Masukkan Nama : ");
	    	String inputNama = scan.nextLine();		
	    	
	    	employee1.setName(inputNama);
	    	
	    	System.out.println("Masukan Alamat : ");
	    	String inputAlamat = scan.nextLine();
	    	employee1.setAddress(inputAlamat);
	    	
	    	System.out.println("masukan Dob : ");
	    	String inputDob = scan.nextLine();
	    	employee1.setDob(inputDob);
	    	employeeService.save2(employee1);
	    	
	    	
	    	System.out.println(inputNama+ " berhasil tersimpan");
	  		
	  		System.out.println("");
	  	} else {
	  		System.out.println("anda salah pilih");
	  	
	  	
		
	}

}}
