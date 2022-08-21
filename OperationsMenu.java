import java.util.Scanner;
public class OperationsMenu {

	public static void main(String[] args) 
	throws java.io.IOException {
		char choice ;
		
		do {
			System.out.println("Select your choice of Operation to Perform ");
			System.out.println("1. Palindrome Number  ");
            System.out.println("2. Patterns of Stars  ");
            System.out.println("3. Prime numbers  ");
            System.out.println("4. Fibonacci Series");
            System.out.println("Choose Operation : ");
            choice = (char) System.in.read();
			} while ( choice <'1'|| choice >'4'); 
        switch (choice) {
        case '1' :   
        	System.out.println("Enter Numbers to check for Palindrome Number : ");
        	Scanner sc = new Scanner(System.in);
        	int value = sc.nextInt();
        	int revValue=0 , storingResult , rem;
        	
        	storingResult = value;
        	while(value>0) {   rem=value%10;
        	               revValue =(revValue*10)+rem;
        	               value=value/10;
        	               }  
        	if (revValue == storingResult)
        	   System.out.println("Yes, It's a palindrome number");
        	else
        	    System.out.println("No, It's not a palindrome number");
            break;
            
        case '2' :
        	System.out.println("Enter Number to make patterns of star: ");
        	Scanner pattern = new Scanner(System.in);
        	int n = pattern.nextInt();
        	for(int i=n;i>=1;i--) {
        		for (int j=1;j<=i;j++) {
        			System.out.print("*");
        		} System.out.println();
        		
        	}break;
        case '3' :
        	System.out.println("Enter Number to check whether it is prime number or not : ");
        	Scanner prime = new Scanner(System.in);
        	int num = prime.nextInt();
        	boolean IsPrime;
       
        	if (num<2) IsPrime = false;
        	else IsPrime = true;
        	
        	for (int i=2;i<=num/i;i++) {
        		if ((num % i)==0) {
        		IsPrime = false;
        		break;
        	}
        }
        	if(IsPrime) System.out.println ("Prime");
        	else System.out.println ("Not Prime");
        	break;
        
	    case '4' :
    	System.out.println("Enter Size to print Fibonnaci series : ");
    	Scanner series = new Scanner(System.in);
    	int size = series.nextInt();
    	int initialA=0 ,initialB=1 , C ;
    	for(int i =1 ; i<=size; i++) {
    		System.out.print(initialA + " ");
    		C = initialA + initialB;
    		initialA = initialB;
    		initialB = C ;
    		break;
    	}
     }
  }
}
	
        	
        
        
        
        
        
        	 
        
	


