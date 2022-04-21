
import java.util.Scanner;

public abstract class Account {

	protected int balance;
	protected int tutar;
	private int id;
	public int yillikkar;
	public int gunlukkar;
	public int ID;
	static Scanner scan=new Scanner(System.in);
	


	public int getBalance() 
	{
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public int getTutar() {
		return tutar;
	}


	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
    

	public int deposit() {
	
	getTutar();
	
	System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
	tutar = scan.nextInt();
	do {
	if (tutar < 0) {
		System.out.println("Geçersiz İşlem Tekrar Deneyiniz. ");
		System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: "); 
	    tutar = scan.nextInt();	    
	}

}
	while(tutar< 0 );
	System.out.println("Hesabınızdaki Toplam Para "+(balance + tutar)+"TL");
	balance=0;
	balance=balance+tutar;
	return 1;
	}
	
	
	public void withdraw() {
		

    System.out.print("Çekmek İstediğiniz Tutarı Giriniz: ");
    int tutar = scan.nextInt();
    
    if(balance >= tutar && tutar>=0) {
    
    balance = balance - tutar;
    
    System.out.println("Kalan Hesap Bakiyeniz: " + balance);
    
    }
    else if(tutar<0)
    {
    	System.out.println("Lütfen geçerli bir sayı giriniz ");
    }
    else  {
    
    System.out.println("Hesap Bakiyenizde "+ tutar +"TL Tutarında Para Mevcut Değildir.");	
    	
    }
    	
    	
    }
	public void Benefit() {
		gunlukkar =yillikkar/365;
		
		
	}
	public void Create_S_ID_Balance()
	{
		balance = getBalance();
		yillikkar=(balance*17/100);
		if(balance>1000)
		{
			System.out.println("Hesabınız açılıyor...");
			System.out.println("günlük kar: "+ yillikkar/365);
		}
		else
			System.out.println("1000 tl'nin altında hesap açamazsınız.");
		
	}
   public void Create_L_ID_Balance()
   {
	   
	   balance= getBalance();
	   yillikkar=(balance*24/100);
	   
	   if(balance>1500)
	   {
		   
		   System.out.println("günlük kar: "+ yillikkar/365);
	   }
	   else
		   
		   System.out.println("1500 tl'nin altında hesap açamazsınız. Lütfen yeterli parayı yatırınız.");
   }

	
	
	
	

	
	
	
}
}
