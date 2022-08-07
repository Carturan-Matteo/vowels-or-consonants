import java.util.Scanner;
public class vowelsorconsonants {
    public static void main(String[] args){
		//Scanner for take in input the letter        
        Scanner sc = new Scanner(System.in);		
		System.out.print("Inserisci una lettera:");
		String lettera = sc.nextLine();
		String letter = lettera.toLowerCase();
		boolean risultato = false;
        //vocal containers
		char[] vocali={'a','e','i','o','u'}; 		
		//I create a loop to scroll inside the container and check if the letter entered is a vowel
		for(int pos=0;pos<vocali.length;pos++)
		{
      		if((letter.charAt(0))==(vocali[pos]))
      		{
     	 		risultato= true;
   			}      	
  		}
   		if(risultato)
   			System.out.println("la lettera e' una vowels.");
   		else 
    		System.out.println("la lettera e' una consonants.");        
    }
}