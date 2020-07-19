package com.epam.vnrvjiet.prathima.ConstructionCost;

import java.io.OutputStreamWriter;
import java.io.IOException;

public class HighStandardMaterial extends ReadInput {
	int ConsructionCost() throws IOException
	{
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	if(IsFullyAutomatedRequired=='y')
	{
		return 2500*TotalAreaOfHouse;
	}
	else if(IsFullyAutomatedRequired=='N')
	{
		return 1800*TotalAreaOfHouse;
	}
	  else 
	  {
		   streamWriter.write("Given Input is Inappropriate");
		   return 0;
		   
	  }
	}
}
