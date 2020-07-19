package com.epam.vnrvjiet.prathima.InterestCalculation;
import java.io.*;
//import java.io.OutputStreamWriter;

public class InterestCalculation {
	public static void main( String[] args ) throws IOException
    {
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		PrintStream stream = new PrintStream(System.out); 
    	ReadInput simpleInterest=new SimpleInterest();
    	ReadInput compoundInterest=new CompoundInterest();
        simpleInterest.GetPrincipalAmount();
    	simpleInterest.GetTimeDuration();
    	simpleInterest.GetRateOfInterest();
    	compoundInterest.PrincipalAmount=simpleInterest.PrincipalAmount;
    	compoundInterest.TimeDuration=simpleInterest.TimeDuration;
    	compoundInterest.RateOfInterest=simpleInterest.RateOfInterest;
    	compoundInterest.GetNumOfTimesInterestCompounded();
    	streamWriter.write("Simple Interest is ");
    	streamWriter.flush();
    	stream.println(((SimpleInterest)simpleInterest).SimpleInterestCalculation());
    	stream.flush();
    	streamWriter.write("Compound Interest is ");
    	streamWriter.flush();
    	stream.println(((CompoundInterest)compoundInterest).CompoundInterestCalculation());
    	stream.flush();
	   
    }

}
