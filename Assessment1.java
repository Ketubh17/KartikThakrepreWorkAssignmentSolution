import java.util.*;
public class Assessment1
{
   Scanner sc = new Scanner(System.in);
   
   public void checkPalindrome()
  {
  
  	int num ,d ,res =0 ,ori =0 ;
  	Scanner sc =new Scanner(System.in);
  	System.out.println("Enter the number");
  	num = sc.nextInt();
  	ori = num;
  	do
	{
  		d = num % 10 ;
   		res = res * 10 + d ;
        	num = num / 10 ; 
  	}while(num > 0);
  	if(ori==res)
  	{
   		System.out.println("Number is palindrome");
  	}
  	else 
  	{
   		System.out.println("Number is not palindrome");
  	}
   }
  public void checkPattern()
  {
    	int num;
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter new number");
  	num = sc.nextInt();
  	int i =num;
 	do
        {
           int j=0;
           do
           {
               System.out.print("*");
               j++;
           }while(j<i);
           System.out.println();
           i--;
        } while(i>0) ;
  
   
  }
  public void checkPrimeNumber()
  {
   	int num ,d =0;
  	boolean flag =true ;
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter new number");
  	num = sc.nextInt();
  	do {
      
        	flag =true;
     
        	num++ ;
   	}while(num <num /2);
   	if(num%2==0)
    
       
       		{
         		System.out.println("Number is prime");
       		}
       		else
       		{
	  		System.out.println("Number is not prime");
       		}
 		
   }
  public void checkFibonacciSeries()
  {
   	int num,a=0, b=1,i=0,c=0;
   	Scanner sc= new Scanner(System.in);
   	System.out.println("Enter number");
   	num = sc.nextInt();
   	do
        {
            System.out.print(a+".");
            c =a + b;
            a= b;
            b =c;
            i++;
        }while(i<=num);
  }

  public static void main(String args[])
  {
       		Assessment1 obj = new Assessment1();
            	int choice;
             	
                Scanner sc = new Scanner(System.in);
       do {

             System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

          + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

         + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

        		System.out.println();
        		choice = sc.nextInt();

        switch (choice) {
                            case 0:

                            choice = 0;

                            break;

                            case 1: {

                                      obj.checkPalindrome();

                                    }

                             break;
        	             case 2: {

                                      obj.checkPattern();

                                     }

                            break;

                            case 3: {

                                      obj.checkPrimeNumber();

                                    }
                     	    break;
                            case 4: {
 
                                       obj.checkFibonacciSeries();
                                    }
   
                            break;
                           default:

                                System.out.println("Invalid choice. Enter a valid no.\n");
                     }

     } while (choice != 0);

     System.out.println("Exited Successfully!!!");

     sc.close();

   }
  
}