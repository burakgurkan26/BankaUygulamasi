
import java.util.Scanner;

public abstract class Account {

	protected int balance;
	private int tutar;
	private int id;
	public int yillikkar;
	public int gunlukkar;
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
	
	System.out.print("Yatýrmak Ýstediðiniz Tutarý Giriniz: ");
	tutar = scan.nextInt();
	do {
	if (tutar < 0) {
		System.out.println("Geçersiz Ýþlem Tekrar Deneyiniz. ");
		System.out.print("Yatýrmak Ýstediðiniz Tutarý Giriniz: "); 
	    tutar = scan.nextInt();	    
	}

}
	while(tutar< 0 );
	System.out.println("Hesabýnýzdaki Toplam Para "+(balance + tutar)+"TL");
	return (balance+tutar);	
	}
	
	
	public void withdraw() {
		

    System.out.print("Çekmek Ýstediðiniz Tutarý Giriniz: ");
    int tutar = scan.nextInt();
    
    if(balance >= tutar) {
    
    balance = balance - tutar;
    
    System.out.println("Kalan Hesap Bakiyeniz: " + balance);
    
    }
    else {
    
    System.out.println("Hesap Bakiyenizde "+ tutar +"TL Tutarýnda Para Mevcut Deðildir.");	
    	
    }
    	
    	
    }
	public void Benefit() {
		
	}


	
	
	
	

	
	
	
}