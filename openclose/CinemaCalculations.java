public class CinemaCalculations {
    public Double calculateAdminFee(Cinema cinema){
        if(cinema instanceof StandardCinema) {
            return ((StandardCinema) Cinema).price * 10/100;
        }
        else if(cinema instanceof DeluxeCinema) {
            return ((StandardCinema) Cinema).price * 12/100;
        }
        else if(cinema instanceof PremiumCinema) {
            return ((StandardCinema) Cinema).price * 20/100;
        } else { 
            return 0.0;    
        }
    }
}
