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
            System.out.println("Faize yatýrmak istediðiniz tutarý giriniz:  ");
            newamount=scan.nextDouble();
            System.out.println("Yýllýk Faiz Oranýný Giriniz:  ");
            interestrate=scan.nextDouble();         
            dailybenefit =(newamount/100)*(interestrate/daysofyear);
            System.out.println("Günlük getiri: " + dailybenefit);
            annualbenefit=dailybenefit*daysofyear;
            System.out.println("Yýllýk getiri: " + annualbenefit);
            System.out.println("Bugüne kadar elde edilen kâr: " + (dailybenefit*(fat.getDayOfYear()-time.getDayOfYear())));
}
}

