package com.epam.vnrvjiet.prathima.ConstructionCost;

import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadInput {
	int MaterialStandard,TotalAreaOfHouse;
	char IsFullyAutomatedRequired;
	Scanner s=new Scanner(System.in);
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	int GetMaterialStandard() throws IOException
	{
		streamWriter.write("1:Standard Material\\n 2:Above Standard Material\\n 3:High Standard Material\\n ");
		streamWriter.write("Enter your Choice");
		streamWriter.flush();
		MaterialStandard=s.nextInt();
		return MaterialStandard;
	}
	void GetTotalAreaOfHouse() throws IOException
	{
		streamWriter.write("Enter area of house");
		streamWriter.flush();
		TotalAreaOfHouse=s.nextInt();
	}
	void GetIsAutomationRequired() throws IOException
	{
		streamWriter.write("Is Automation Required Enter y/N ");
		streamWriter.flush();
		IsFullyAutomatedRequired=s.next().charAt(0);
		 
	}
	
}
