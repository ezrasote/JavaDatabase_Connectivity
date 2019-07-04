package com.Eksad.latihanjdbc;

import java.util.Scanner;

import com.Eksad.latihanjdbc.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeService employeeService = new EmployeeService();
    	
    	
    	//employee.conn();
    	
    	//employee.getAll();
    	
    	//employee.getById(3);
    	
    	//employee.getByName("'Ezra Soterion Nugroho'");
    	
    	//employee.save();
//    	
  	Scanner scan = new Scanner(System.in); 
//    	String inputan = scan.nextLine();
//    	System.out.println("Halo " + inputan);
    	
   /*
    	
    	Employee employee1 = new Employee();
    	Scanner scan = new Scanner(System.in); 
    	
    	System.out.println("Masukkan Nama : ");
    	String inputNama = scan.nextLine();		
    	
    	
    	//kalo integer next int
    	employee1.setName(inputNama);
    	
    	System.out.println("Masukan Alamat : ");
    	String inputAlamat = scan.nextLine();
    	employee1.setAddress(inputAlamat);
    	
    	//untukinteger
    	
    	System.out.println("masukan Dob : ");
    	String inputDob = scan.nextLine();
    	employee1.setDob(inputDob);
    	employeeService.save(employee1);
    	
    	
    	System.out.println(inputNama+ " berhasil tersimpan");
  
  	*/
  		System.out.println("Pilih Angka : ");
  	System.out.println("1. Jeruk");
  	System.out.println("2. Mangga");
  	System.out.println("3. Apel");
  	
  	String angkaTerpilih = scan.nextLine();
  	if (angkaTerpilih.equals("1")) {
  		System.out.println("Saya pilih jeruk");
  	} else if (angkaTerpilih.equals("2")) {
  		System.out.println("Saya pilih mangga");
  	} else if (angkaTerpilih.equals("3")) {
  		System.out.println("Saya pilih apel");
  	} else {
  		System.out.println("anda salah pilih");
  	}}}

	
    	
    	
    	
    	
     
  