package com.epam.vnrvjiet.prathima.ConstructionCost;
 import java.io.*;


public class TotalConstructionCost {
	public static void main( String[] args ) throws IOException
	{
	ReadInput ReadInput=new ReadInput();
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	PrintStream PrintStream = new PrintStream(System.out); 
	switch(ReadInput.GetMaterialStandard())
	{
	case 1:ReadInput standardMaterial=new StandardMaterial();
    	standardMaterial.GetTotalAreaOfHouse();
    	streamWriter.write("Total Construction Cost is:");
    	streamWriter.flush();
    	PrintStream.print(((StandardMaterial)standardMaterial).ConstructionCost());
    	PrintStream.flush();
    	break;
	case 2:ReadInput aboveStandardMaterial=new AboveStandardMaterial();
		aboveStandardMaterial.GetTotalAreaOfHouse();
		streamWriter.write("Total Construction Cost is:");
		streamWriter.flush();
		PrintStream.print(((AboveStandardMaterial)aboveStandardMaterial).ConstructionCost());
		PrintStream.flush();
		break;
	case 3:ReadInput highStandardMaterial=new HighStandardMaterial();
		highStandardMaterial.GetTotalAreaOfHouse();
		highStandardMaterial.GetIsAutomationRequired();
		streamWriter.write("Total Construction Cost is:");
		streamWriter.flush();
		PrintStream.print(((HighStandardMaterial)highStandardMaterial).ConsructionCost());
		PrintStream.flush();
		break;
	default:streamWriter.write("Entered values are not appropriate");
    
	}
	}
	

}


	