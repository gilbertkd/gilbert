package orghcl;

import java.net.PasswordAuthentication;

public class clientdetails extends Employee {
	private void clientname() {
	System.out.println("enter the client name");
	}
	private void clientid() {
	System.out.println("enter the client id");
	}
	private void username() {
		System.out.println("enter the username");
	}
	private void password() {
		System.out.println("enter the password");
		System.out.println("this is valid user");
	}
	public static void main(String[] args) {
    clientdetails a = new clientdetails();
	a.clientname();
	a.clientid();
	a.username();
	a.password();
	}
	
    
    
    
    
    
    
	}


