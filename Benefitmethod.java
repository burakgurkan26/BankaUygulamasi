import java.time.LocalDate;

public class Benefitmethod extends Account{
	public void Benefit() {
        double dailybenefit;
        double annualbenefit;
        double interestrate;
        final double daysofyear=365.0;
        double newamount;
            String date = "2022-02-14";
            LocalDate time = LocalDate.parse(date);	    
	    LocalDate fat = LocalDate.now();
            System.out.println("Faize yat�rmak istedi�iniz tutar� giriniz:  ");
            newamount=scan.nextDouble();
            System.out.println("Y�ll�k Faiz Oran�n� Giriniz:  ");
            interestrate=scan.nextDouble();         
            dailybenefit =(newamount/100)*(interestrate/daysofyear);
            System.out.println("G�nl�k getiri: " + dailybenefit);
            annualbenefit=dailybenefit*daysofyear;
            System.out.println("Y�ll�k getiri: " + annualbenefit);
            System.out.println("Bug�ne kadar elde edilen k�r: " + (dailybenefit*(fat.getDayOfYear()-time.getDayOfYear())));
}
}

