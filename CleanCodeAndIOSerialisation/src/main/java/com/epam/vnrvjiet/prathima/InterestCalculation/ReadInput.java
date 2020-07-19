package com.epam.vnrvjiet.prathima.InterestCalculation;

import java.util.Scanner;

import java.io.IOException;
import java.io.OutputStreamWriter;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ReadInput {
	float PrincipalAmount,TimeDuration,RateOfInterest;
	int NumOfTimesInterestCompounded;
	//private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);
	Scanner s=new Scanner(System.in);
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	void GetPrincipalAmount() throws IOException
	{
		
	    streamWriter.write("Enter Principal Amount");
	    streamWriter.flush();
	//LOGGER.info("enter principal amount:");
	    PrincipalAmount=s.nextFloat();
	}
	void GetTimeDuration() throws IOException
	{
		streamWriter.write("Enter Time Period in Years");
		streamWriter.flush();
		TimeDuration=s.nextFloat();
		
	}
	void GetRateOfInterest() throws IOException
	{
		streamWriter.write("Enter Rate of Interest");
		streamWriter.flush();

		RateOfInterest=s.nextFloat();
	}
	void GetNumOfTimesInterestCompounded() throws IOException
	{
		streamWriter.write("enter NumOfTimesInterestCompounded per unit time:");
		streamWriter.flush();
	NumOfTimesInterestCompounded=s.nextInt();
	}
	
	
	
}