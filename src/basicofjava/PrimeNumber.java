package basicofjava;

public class PrimeNumber {
 public static void main(String[] args) {
	

	int number =7;
 int count=0;
 
 if(number>1)
 {
	 for(int i=1;i<=number;i++)
 {
	 if(number%i==0)
	 {
		 count++;
 }}
	 if(count==2)
	 {
		 System.out.println("the number is prime number");
 }
 else
 {
	 System.out.println("the number is not prime number");
 
 }  }
 else
 {
	 System.out.println("the number is not prime number");
 }}
}
	
	
	
	