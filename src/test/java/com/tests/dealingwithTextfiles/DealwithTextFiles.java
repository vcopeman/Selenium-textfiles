package com.tests.dealingwithTextfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;

public class DealwithTextFiles 
   
{
	//How to create a new file. Useful for generating logs
	@Test(enabled=false) 
	public void createnewfile() throws IOException
	{
		File file = new File("C:\\Automation0705\\filetest.txt");
		file.createNewFile();
	}
	
	@Test(enabled=false) 
	public void writetofile() throws IOException
	{
		FileWriter writer = new FileWriter("C:\\Automation0705\\filetest.txt");
		@SuppressWarnings("resource")
		BufferedWriter actualwriter = new BufferedWriter(writer);
		
		actualwriter.write("London");
		actualwriter.newLine();
		actualwriter.write("Birmingham");
		actualwriter.newLine();
		actualwriter.write("Poole");
		actualwriter.newLine();
		actualwriter.write("Isle of Wight");
		actualwriter.flush();
	}
	
	@Test
	public void readfromfile() throws IOException
	{
		FileReader reader = new FileReader("C:\\Automation0705\\filetest.txt");
		@SuppressWarnings("resource")
		BufferedReader actualreader = new BufferedReader(reader);
		
		//System.out.println(actualreader.readLine());
		
		String i;
		while((i=actualreader.readLine())!=null)
		{
			if(i.indexOf("on")>-1) //'Index of' function
			{
			System.out.println(i);
		    }			
		}
	}
}
