import java.text.DecimalFormat;


public class BMI {
    
  
    
    public String vrednostBMI(double tezina, double visina) {
    	
    	double bmi = (tezina/(visina*visina));
    	DecimalFormat formater = new DecimalFormat("0.00");
    	;
    	String s = "";
    	
    	 if (bmi <= 15)
            s = "Vas BMI od "+formater.format(bmi)+" je alarmantan; \nidi jedi slaninu";
          if ((bmi > 15) && (bmi <= 18.5))
            s="Vas BMI od "+formater.format(bmi)+" je zabrinjavajuci;\ndodji kod moje babe na musaku";
          if ((bmi > 18.5) && (bmi <= 25))
            s="Vas BMI od "+formater.format(bmi)+" spada u normalne vrednosti.\n Zavidim ti";
            if ((bmi > 25) && (bmi <= 40))
             s="Vas BMI od "+formater.format(bmi)+" je iznad proseka;\nMoj predlog: 1 cokolada dnevno manje";
             if (bmi > 40)
            	 s="Vas BMI od "+formater.format(bmi)+" je zeznuo i Bokija13";
    	
    	return s;
    }
    
}