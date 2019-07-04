package com.Eksad.latihanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.Eksad.latihanjdbc.model.Employee;

public class EmployeeService {

	private static final String URL = "jdbc:postgresql://localhost:5432/eksaddb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";

	public Connection conn() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//			System.out.println("Koneksi Berhasil");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void getAll() {
		try {
			Connection con = conn();
			Statement st = con.createStatement();
			String sql = "select * from employee"; // memanggil tabel employee di database atau pg admin
			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");

				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Date of Birth: " + dob);
				System.out.println("Address: " + address);
			}
			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void getById(int id) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "select * from employee where id= " + id; // memanggil tabel employee di database atau pg admin
			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				id = result.getInt("id");
				String name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");

				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Date of Birth: " + dob);
				System.out.println("Address: " + address);
			}
			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void getByName(String name) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "select * from employee where name= " + "'"+ name+ "'"; // memanggil tabel employee di database atau pg
																		// admin
			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");

				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Date of Birth: " + dob);
				System.out.println("Address: " + address);
			}
			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void update(int id, String nama, String address) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "update employee set name = '" + nama + "',address='" + address + "' where id =" + id;
			System.out.println(sql);
			int result = st.executeUpdate(sql);

			/*
			 * while (result.next()) { int id = result.getInt("id"); name =
			 * result.getString("name"); Date dob = result.getDate("dob"); String address =
			 * result.getString("address");
			 * 
			 * System.out.println("ID: " + id); System.out.println("Name: " + name);
			 * System.out.println("Date of Birth: " + dob); System.out.println("Address: " +
			 * address); }
			 */
//			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void save(String nama, String alamat, int umur, int id) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();
			
			String sql = "update employee set name = '" + nama+"',address= '"+alamat+"', age= '"+umur+"'  where id ="+id; 
			int result = st.executeUpdate(sql);
			
			/*while (result.next()) {
				int id = result.getInt("id");
				name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");

				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Date of Birth: " + dob);
				System.out.println("Address: " + address);
			}*/
//			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void save2(Employee employee) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "insert into employee (name,dob,address) value (" 
			+ "'" + employee.getName() + "'," + "'"
			+ employee.getDob() + "'," + "'" + employee.getAddress() + "')";

			int result = st.executeUpdate(sql);

			/*
			 * while (result.next()) { int id = result.getInt("id"); name =
			 * result.getString("name"); Date dob = result.getDate("dob"); String address =
			 * result.getString("address");
			 * 
			 * System.out.println("ID: " + id); System.out.println("Name: " + name);
			 * System.out.println("Date of Birth: " + dob); System.out.println("Address: " +
			 * address); }
			 */
//				result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception

		}
	}
	
	}


