package com.Date11sept;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOpreation {
	public  static void fileWiter(String fnm)
	{
		ObjectOutputStream ow=null;
		
		try {
			ow=new ObjectOutputStream(new FileOutputStream(fnm));
			String text="";
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter text to write and type \\q to exit");
			while(true)
			{
				text =br.readLine();
				if(text.equals("\\q"))
					break;
				ow.writeBytes(text +"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally
		{
			try
			{
				ow.close();
			}catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
	public static void fileRead(String fnm)
	{
		ObjectInputStream in=null;
		
		try
		{
			in=new ObjectInputStream(new FileInputStream(fnm));
			String txt="";
			while((txt=in.readLine()) !=null)
			{
				System.out.println(txt);
			}
		}catch(IOException ie)
		{
			System.out.println(ie.getMessage());
		}finally
		{
			try
			{
				in.close();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
	public static void countLines(String fnm)
	{
		BufferedReader br=null;
		int linecount=0;
		int wordcount=0;
		
		
		try
		{
			br=new BufferedReader(new InputStreamReader(new FileInputStream(fnm)));
			
			String line;
			
			while((line=br.readLine()) != null)
			{
				linecount++;
			
				String words[]=line.split(" ");
				wordcount=wordcount+words.length;
		
			}
			System.out.println("Total lines = " + linecount);
			System.out.println("Total words = " + wordcount);
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void copyFile(String inputfile,String outputFile)
	{
		FileInputStream fis= null;
		FileOutputStream fos=null;
		try {
			fis= new FileInputStream(inputfile);
			fos=new FileOutputStream(outputFile);
		int ch;
		
			while((ch=fis.read()) != -1)
			{
				fos.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
// filter reduce and map concepts

//stream class function expression 