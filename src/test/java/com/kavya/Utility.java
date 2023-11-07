package com.kavya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	String url;
	String gender;
	String email;
	String firstname;
	String lastname;
	String password;
	String confirmpassword;
	
	public Utility(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\kbjagadeesh\\assessment3\\cucumber2\\kavya\\src\\main\\resources\\feature\\data.property");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		gender =prop.getProperty(gender);
		email=prop.getProperty(email);
		 firstname = prop.getProperty("Firstname");
		lastname  = prop.getProperty ("Lastname");
		password = prop.getProperty("Password");
		confirmpassword =prop.getProperty("Confirm");		
	}

}
