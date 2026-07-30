package com.example.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
	//creating object
	Account acc = new Account(12000,"krishna","kr@131","btm 2nd stage");
    //send acc to another network/write to file system/ databases.
	 //we will write object to file system.
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
	//write the acc object to the file
    
	oos.writeObject(acc);
	
	System.out.println("Driver.main()...serilization");
	}

}
