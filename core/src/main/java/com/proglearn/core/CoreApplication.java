package com.proglearn.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);

		try{
			String url = "jdbc:mysql://localhost/proglearn?serverTimezone=Europe/Moscow&useSSL=false";
			String username = "root";
			String password = "12345678";
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			try(Connection conn = DriverManager.getConnection(url, username, password)){
				System.out.println("CONNECTED C:");
			}
		}
		catch (Exception e){
			System.out.println("NOT CONNECTED :C");
			System.out.println(e);
		}

	}
}

