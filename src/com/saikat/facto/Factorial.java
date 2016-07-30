package com.saikat.facto;

/**
 * @author Saikat
 *
 */
public class Factorial {

	/**
	 * Holds the logic of multiplication and creating linked list(custom)
	 * @param number
	 * @param header
	 * @return MyNumber
	 */
	private void multiply(int number,MyNumber header){
		
		MyNumber temp = header;
		MyNumber temp1 = header;
		int  carry = 0;
		while(temp != null){
			
		  int prod = temp.getDigit() * number + carry;
		  carry = prod / 10;
		  temp.setDigit(prod % 10);
		  
		  if(temp.getNext() == null){
			  temp1 =temp;
		  }
			  temp = temp.getNext();
			  

		  	
		}
		
		while(carry > 0){
		  
		  temp1.setNext(new MyNumber());
		  temp1.getNext().setDigit(carry % 10);
		  carry = carry / 10;
		  temp1 = temp1.getNext();
		  		
		}
		
		
	}
	
	
	/**
	 * Only public api exposed to user
	 * Takes input a non negative integer and finds out the factorial
	 * @param factNumber
	 */
	public void factorial(int factNumber){
		
		//If the number is not an integer
		if(factNumber != Math.floor(factNumber)){
			System.out.println("Please provide non negative integer");
			System.exit(0);
		}
		if(factNumber<0){
			System.out.println("Please provide non negative integer");
			System.exit(0);
		}
		
		if(factNumber <2){
			
			System.out.println("The factorial is : 1"); 
		}else{
			
			MyNumber header = new MyNumber();
			header.setDigit(1);
			for(int i =2 ; i<=factNumber ;i++){
				
				 multiply(i, header);
			}
			System.out.print("The factorial is : ");
			printReverse(header);
		}
		
		
	}
	
	/**
	 * prints the list in reverse order
	 * @param header
	 */
	private void printReverse(MyNumber header){
		
		MyNumber temp = header;
		MyNumber temp1 = header;
		while(temp.getNext()!= null){
			
			temp = temp.getNext();
			
		}
		while(!temp.equals(header)){
			
			while(!temp1.getNext().equals(temp)){
				
				temp1 = temp1.getNext();
				
			}
			System.out.print(temp.getDigit());
			temp =temp1;
			temp1 = header;
			
		}
		System.out.print(header.getDigit());
		
	}
	
}
