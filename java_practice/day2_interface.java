package com.bajaj.helloworld;

interface features{
	public void sendemail();
	public void sendsms();
	public void playgames();
}

class Mobile implements features{
	@Override
	public void sendemail() {
		System.out.println("sending email");
	}
	@Override
	public void sendsms() {
		System.out.println("sending message");
	}
	@Override
	public void playgames(){
		System.out.println("playing games");
	}
}
public class day2_interface{
	public static void main(String args[]) {
	Mobile obj=new Mobile();
	obj.sendemail();
	obj.sendsms();
	obj.playgames();
	}
}
