package com.example.deserialization;

 
import com.example.serialization.Account;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Driver1 {

	public static void main(String[] args)throws FileNotFoundException, IOException,ClassNotFoundException
	{
		
		//lets deserialize the same file 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		 Account account = (Account)ois.readObject();
		 //reading the data from the acc.ser file
		 System.out.println("Driver1.main().....deserialization");
		 System.out.println("balance : "+account.getBalance()+" "+ "name : "+ account.getName()+" " + "acId :" + account.getAcId()+" "+"address : "+ account.getAddress());

	}

}
