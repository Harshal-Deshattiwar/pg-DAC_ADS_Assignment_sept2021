package _11.Recursion_quotientAndRemainder;

public class RecursiveDivision {
	public static int Quotient(int divident, int divisior) throws CustomException{
		if(divisior == 0) {
			System.out.println("Divisior is zero !!!!");
			return -1;
		}
		if(divident == 0 )
			return 0;
		else if(divident==divisior) {
			return 1;
			}
		else if(divident < divisior)
			return 0;
		//Handle negative inputs
		 if (divisior < 0)
			 divisior = -divisior;
	     if (divident < 0)
	    	 divident = -divident;
		return (1 +  Quotient(divident-divisior,divisior));
	}
	public static int Remainder(int divident, int divisior) throws CustomException {
		
		if(divisior == 0) {
			System.out.println("divisior is 0  invalid!!!");
			return divident;
		}
		
	 
		if(divident == 0)
			return -divisior;
		
		if(divident-divisior == 0) {
			return 0;
			}
		
		//Handle negative inputs
		 if (divisior < 0)
			 divisior = -divisior;
	     if (divident < 0)
	    	 divident = -divident;
	     
		return (divident- (divisior *(Quotient(divident, divisior)))) ;
		
	}
	public static void main(String[] args) throws CustomException {
		System.out.println(Quotient(10, 3));
		System.out.println(Remainder(12, 5));

	}

}
