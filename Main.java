import java.time.LocalDate; 
import java.util.Random;   
import java.util.Scanner;

public class Main extends Account{

	public static void main(String[] args) {
		
		/*String date = "2022-02-14";
		LocalDate time = LocalDate.parse(date); 
	    System.out.println(time.getMonthValue());  
	    System.out.println(time.getYear());
	    System.out.println(time.getDayOfYear());
	    
	    LocalDate fat = LocalDate.now();
	    System.out.println(fat.getMonthValue());  
	    System.out.println(fat.getYear());
	    System.out.println(fat.getDayOfYear());
	     
	    System.out.println("Değer: "+ (fat.getDayOfYear()-time.getDayOfYear()));*/
	    Main ma= new Main();
	    
	    int deger;
	    
	     System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
	     System.out.println("1.Para yatırma\n2.Para çekme\n3.Kısa vadeli hesap açma\n4.Uzun vadeli hesap açma");
	     deger=scan.nextInt();
	    
	    
	     while(deger<6)
	     {
	    	 
	    	 switch(deger) {
	   
	    
	    
	    case 1: 
	    	ma.deposit();
	    	
	    	break;
	    case 2:
	    	ma.withdraw();
	    	break;
	    case 3:
	    	ma.Create_S_ID_Balance();
	    break;
	    case 4:
	    	ma.Create_L_ID_Balance();
	    default:
	    	System.out.println("çıkış yapılıyor\n");
	    	
	    	
	    	break;
	   

	    	 }
	    	 System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz: "); 
	    	 System.out.println("1.Para yatırma\n2.Para çekme\n3.Kısa vadeli hesap açma\n4.Uzun vadeli hesap açma");
	    	  deger=scan.nextInt();
	    	 
	}
	  
	   
	   /*ma.deposit();
	   ma.withdraw();
	   ma.Benefit();*/
	   
	   
	  
	    
	}
}
		
	
