package com.epam.vnrvjiet.prathima.InterestCalculation;


public class CompoundInterest extends ReadInput {
		double CompoundInterestCalculation()
		{
			double result=Math.pow((1+(RateOfInterest)/(100*NumOfTimesInterestCompounded)),TimeDuration*NumOfTimesInterestCompounded);
			return(PrincipalAmount*result-PrincipalAmount);
		}


}
